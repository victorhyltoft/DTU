package assignments.assignment1;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Victor Hyltoft - s214964
 * Notes:
 * We use the "private" keyword to encapsulate our methods we haven't
 * planned to expose to other classes as this is simply best practice.
 *
 * We use "final" keywords for some parameters to make them immutable objects
 * (constants) to prevent accidental altering. Also, because it's best practice.
 */

public class PredatorPrayTeleport {

    public static void main(String[] args) {

        runSimulation(10, 3, 100);
    }

    /**
     * Runs the simulation for the hunt
     * @param gridSize defines the gridSize size's height and width
     * @param maxTranslateLength defines how far an animal can translate per move.
     * @param moves defines number of moves to be performed
     */
    public static void runSimulation(final int gridSize, final int maxTranslateLength, final int moves) {
        // Print parameters
        System.out.println("n=" + gridSize + " s=" + maxTranslateLength + " t=" + moves);

        // Check parameters are valid.
        parameterValidation(gridSize, maxTranslateLength, moves);

        // Initialize points to store the animals' location
        Point pray = new Point(), predator = new Point();

        // Create random start positions for the pray and predator
        generateCoordinates(pray, gridSize);
        generateCoordinates(predator, gridSize);

        // Printing the start positions
        printPositions(pray, predator);

        // In case 0 moves, the for-loop won't run, therefore we will have to check if positions match first
        isMatchingPositions(pray, predator);

        // Run through all moves to be performed
        for (int i = 0; i < moves; i++) {
            // Move pray
            int prayMovement = generateRandomInt(-maxTranslateLength, maxTranslateLength);
            movePray(pray, prayMovement, gridSize, maxTranslateLength);

            // Move predator
            movePredator(predator, pray, maxTranslateLength);

            // Print current positions for pray and predator
            printPositions(pray, predator);

            // Check positions match
            isMatchingPositions(pray, predator);

        }

    }


    /**
     * Validates the given parameters.
     */
    private static void parameterValidation(final int gridSize, final int maxTranslateLength, final int moves) {

        if ((gridSize <= 0) || (maxTranslateLength <= 1) || (moves < 0)) {
            System.out.println("Illegal Parameters!");
            System.exit(0);
        }

        // While this validation doesn't really need its own method, I like to separate
        // code snippets which terminates the program into its own methods.

    }


    /**
     * Generates random coordinates for the animal inside the gridSize
     * @param animal takes an animal (pray or predator) as an argument
     * @param gridSize is the border of the gridSize
     */
    private static void generateCoordinates(Point animal, final int gridSize) {
        // Iterate through both coordinates; x and y
        for (int i = 0; i < 2; i++) {
            // Update the animals' location
            animal.setLocation(generateRandomInt(0, gridSize), generateRandomInt(0, gridSize));
        }
    }


    /**
     * Pretty self-explanatory method
     * @param max generates a number between 0-max
     * @param min shifts the generated number
     **/
    private static int generateRandomInt(int min, int max) {
        // This way of generating a random integer in a specific range is arguably better than Random.nextInt().
        // ThreadLocalRandom is equivalent as it extends the Random class
        return ThreadLocalRandom.current().nextInt(min, max);
    }


    /**
     * This method check to see if the current coordinates of the pray and predator matches.
     * In the case they match, the program prints a confirmation and terminates.
     */
    private static void isMatchingPositions(Point pray, Point predator) {
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
    private static void movePray(Point pray, int randomInt, final int gridSize, final int maxTranslateLength) {
        // Check to see if prays coordinates are divisible by s (maxTranslateLength)
        // We add some extra "unneeded" parentheses' to make the condition more readable.
        if ((pray.x % maxTranslateLength == 0) && (pray.y % maxTranslateLength == 0)) {
            // Teleport pray to new location
            generateCoordinates(pray, gridSize);
            // If pray teleport, then it should not also translate. That is why we have en else-statement afterwards
        } else {
            // Check x-coordinate for overflow
            // In case of overflow, we'll move the animal to the closest gridSize edge
            // else we will translate the pray normally
            if (checkOverflow(pray.x, randomInt)) {
                pray.x = gridSize - 1;
            } else {
                pray.x += randomInt;
            }

            // Check y-coordinate for overflow
            if (checkOverflow(pray.y, randomInt)) {
                pray.y = gridSize - 1;
            } else {
                pray.y += randomInt;
            }
        }

        // Check pray is still inside gridSize
        moveInsideGrid(pray, gridSize);
    }


    /**
     * Check for overflow as (animalCoordinate + movement) could possibly result in overflow.
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
     * Moves the predator
     */
    private static void movePredator(Point predator, Point pray, final int maxTranslateLength) {

        int distanceX = (int) Point.distance(predator.x, 0, pray.x,  0);
        int distanceY = (int) Point.distance(0, predator.y, 0,  pray.y);

        // Translate the predator the optimal distance towards the pray

        // If distance to pray is less
        if (distanceX <= maxTranslateLength) {
            // Here I use a ternary expression to compact the code as the emphasis is not
            // on the branching but on the values being given to the coordinates of the predator.
            // This ternary expression simply just adds or subtract the distance
            // depending on the direction of the pray compared to the predator.
            predator.translate(predator.x < pray.x ? distanceX : -distanceX,0);
        } else {
            predator.translate(predator.x < pray.x ? maxTranslateLength : -maxTranslateLength,0);
        }
        if (distanceY <= maxTranslateLength) {
            predator.translate(0, predator.y < pray.y ? distanceY : -distanceY);
        } else {
            predator.translate(0, predator.y < pray.y ? maxTranslateLength : -maxTranslateLength);
        }
    }


    /**
     * Moves an animal (pray) inside the grid if outside.
     */
    private static void moveInsideGrid(Point animal, final int gridSize) {
        // Simple comparisons to check if pray is inside the given gridSize
        // and if not then update the coordinate value to be inside.
        if (animal.x >= gridSize) {
            animal.x = gridSize - 1;
        } else if (animal.x < 0) {
            animal.x = 0;
        }
        if (animal.y >= gridSize) {
            animal.y = gridSize - 1;
        } else if (animal.y < 0) {
            animal.y = 0;
        }
    }


    /* printPositions:
     * Prints the current coordinates of the pray and then the predator.
     */
    private static void printPositions(Point pray, Point predator) {
        System.out.println("["+pray.x+";"+pray.y+"] ["+predator.x+";"+predator.y+"]" );
    }

}
