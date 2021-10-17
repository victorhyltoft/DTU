package assignments.assignment1;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Victor Hyltoft - s214964
 *
 */

public class PredatorPray {

    public static void main(String[] args) {
        runSimulation(100, 3, 20);
    }

    /**
     * Runs the simulation for the hunt
     * @param grid defines the grid size's height and width
     * @param maxTranslateLength defines how far an animal can translate per move.
     * @param moves defines number of moves to be performed
     */
    public static void runSimulation(final int grid, final int maxTranslateLength, final int moves) {
        // Print parameters
        System.out.println("n=" + grid + " s=" + maxTranslateLength + " t=" + moves);

        // Check parameters are valid.
        parameterValidation(grid, maxTranslateLength, moves);

        // Initialize points to store the animals' location as coordinates (x and y)
        Point pray = new Point(), predator = new Point();

        // Create random start positions for the pray and predator inside the grid
        generateCoordinates(pray, grid);
        generateCoordinates(predator, grid);

        // Printing the start positions
        printPositions(pray, predator);

        // In case 0 moves, the for-loop won't run, therefore we will have to check if positions match first
        checkPositions(pray, predator);

        // Run through all moves to be performed
        for (int i = 0; i < moves; i++) {
            // Move pray
            movePray(pray, generateRandomInt(-maxTranslateLength, maxTranslateLength), grid);

            // Move predator
            movePredator(predator, pray, maxTranslateLength);

            // Print current positions for pray and predator
            printPositions(pray, predator);

            // Check positions match
            checkPositions(pray, predator);
        }
    }


    /**
     * Validates the given parameters as detailed in the assignment.
     * @param grid is n
     * @param maxTranslateLength is s
     * @param moves is t
     */
    private static void parameterValidation(final int grid, final int maxTranslateLength, final int moves) {
        if ((grid <= 0) || (maxTranslateLength <= 0) || (moves < 0)) {
            System.out.println("Illegal Parameters!");
            System.exit(0);
        }
        // While this validation doesn't really need its own method, I like to separate
        // code snippets which terminates the program into its own methods to make it less cluttered.
    }


    /**
     * Generates random coordinates for the animal inside the grid
     * @param animal takes an animal (pray or predator) as an argument
     * @param grid is the size of the grid
     */
    private static void generateCoordinates(Point animal, final int grid) {
        // Iterate through both animals' coordinates
        for (int i = 0; i < 2; i++) {
            // Update the animals' location
            animal.setLocation(generateRandomInt(0, grid), generateRandomInt(0, grid));
        }
    }


    /**
     * Generates a random number between min and max.
     * @param max upper bound (excluded)
     * @param min lower bound (included)
     * @return random integer between min and max
    **/
    private static int generateRandomInt(int min, int max) {
        // This way of generating a random integer in a specific interval is nicer than Random.nextInt()
        // as it's easier to define/see what the interval is.
        // ThreadLocalRandom is equivalent as it extends the Random class
        return ThreadLocalRandom.current().nextInt(min, max);
    }


    /**
     * Prints the current coordinates of the pray and then the predator.
     */
    private static void printPositions(Point pray, Point predator) {
        System.out.println("["+pray.x+";"+pray.y+"] ["+predator.x+";"+predator.y+"]" );
    }


    /**
     * This method check to see if the current coordinates of the pray and predator matches.
     * In the case they match, the program prints a confirmation and terminates.
     */
    private static void checkPositions(Point pray, Point predator) {
        // Compare points
        if (pray.equals(predator)) {
            // Successfully completed program
            System.out.println("Catch!");
            System.exit(0);
        }
    }


    /**
     * Moves (translates) the pray
     * @param pray the pray
     * @param randomInt a random integer that moves the pray
     */
    private static void movePray(Point pray, int randomInt, final int grid) {
        // Check new x-coordinate for overflow
        // In case of overflow, we'll move the animal to the grid edge
        // else we will translate the pray normally
        if (checkOverflow(pray.x, randomInt)) {
            pray.x = grid - 1;
        } else {
            pray.x += randomInt;
        }

        // Check y-coordinate for overflow
        if (checkOverflow(pray.y, randomInt)) {
            pray.y = grid - 1;
        } else {
            pray.y += randomInt;
        }

        // Check pray is still inside gridSize
        moveInsideGrid(pray, grid);

        // Here I prioritized more methods to make the code more readable
        // instead of having all the mechanics grouped together.
    }


    /**
     * Check for overflow as (animalCoordinate + movement) could possibly result in overflow.
     * @return true if sum overflows
     */
    private static boolean checkOverflow(int animalCoordinate, final int movement) {
        // Check if sum results in overflow
        try {
            //noinspection ResultOfMethodCallIgnored
            Math.addExact(animalCoordinate, movement);
        } catch (ArithmeticException e) {
            return true;
        }
        return false;
    }


    /**
     * This method checks if an animal is outside the grid and if so, moves it to the closets border inside the grid.
     * @param animal the animal to check is inside the grid
     * @param grid the grid size defined in the beginning of the program.
     */
    private static void moveInsideGrid(Point animal, final int grid) {
        // Simple comparisons to check if pray is inside the given grid
        // and if not then update the coordinate value to be inside.
        if (animal.x >= grid) {
            animal.x = grid - 1;
        } else if (animal.x < 0) {
            animal.x = 0;
        }
        if (animal.y >= grid) {
            animal.y = grid - 1;
        } else if (animal.y < 0) {
            animal.y = 0;
        }
    }

    /**
     * Moves the predator towards the Pray
     */
    private static void movePredator(Point predator, Point pray, final int maxTranslateLength) {
        // Calculate the horizontal and vertical distance between the predator and pray
        int distanceX = (int) Point.distance(predator.x, 0, pray.x,  0);
        int distanceY = (int) Point.distance(0, predator.y, 0,  pray.y);

        // Translate the predator the optimal distance towards the pray (don't overshoot)

        // If distance to pray is less than max possible movement length,
        // we want the predator to move in smaller steps to not overshoot.
        if (distanceX <= maxTranslateLength) {
            // Here I use a ternary expression to compact the code as the emphasis is not
            // on the branching but on the values being given to the coordinates of the predator.
            // This ternary expression simply just adds or subtract the distance
            // depending on the direction of the pray compared to the predator.
            predator.translate(predator.x < pray.x ? distanceX : -distanceX,0);
            // We could also have written; pray.x += predator.x < pray.x ? distanceX : -distanceX;
            // but I used the translate-method to emphasize that we are translating (moving) the Pray.
        } else {
            predator.translate(predator.x < pray.x ? maxTranslateLength : -maxTranslateLength,0);
        }
        // Same steps just with the y-coordinate instead of the x-coordinate.
        if (distanceY <= maxTranslateLength) {
            predator.translate(0, predator.y < pray.y ? distanceY : -distanceY);
        } else {
            predator.translate(0, predator.y < pray.y ? maxTranslateLength : -maxTranslateLength);
        }
    }

}
