package assignments.assignment1;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Victor Hyltoft - s214964
 *
 */

public class PredatorPray {

    public static void main(String[] args) {

        runSimulation(10, 2, 20);
    }

    /**
     * Runs the simulation for the hunt
     * @param grid defines the grid size's height and width
     * @param maxTranslateLength defines how far an animal can translate per move.
     * @param moves defines number of moves to be performed
     */
    public static void runSimulation(final int grid, final int maxTranslateLength, final int moves) {
        // We use "final int" as keywords for some parameters to make
        // them immutable objects to prevent accidental altering.

        // Check parameters are valid.
        parameterValidation(grid, maxTranslateLength, moves);

        // Initialize points to store the animals' location
        Point pray = new Point(), predator = new Point();

        // Create random start positions for the pray and predator
        generateCoordinates(pray, grid);
        generateCoordinates(predator, grid);

        // Printing the start positions
        printPositions(pray, predator);

        // In case 0 moves, the for-loop won't run, therefore we will have to check if positions match first
        isMatchingPositions(pray, predator);

        // Run through all moves to be performed
        for (int i = 0; i < moves; i++) {
            // Move predator
            movePredator(predator, pray, maxTranslateLength);

            // Move pray
            movePray(pray, generateRandomInt(-maxTranslateLength, maxTranslateLength), grid);

            /*
             * We actually move the predator before the pray.
             * This is done as the predator moves in relation to the current position of the pray.
             * If we first call movePray, the predator would move towards the new coordinates
             * of the pray instead, which is unwanted behavior in our program.
             */

            // Print current positions for pray and predator
            printPositions(pray, predator);

            // Check positions match
            isMatchingPositions(pray, predator);

        }

    }


    /**
     * parameterValidation:
     * Validates the given parameters.
     * Note: We use the private keyword to encapsulate our methods we haven't
     * planned to expose to other classes as this is simply best practice.
     */
    private static void parameterValidation(final int grid, final int maxTranslateLength, final int moves) {

        if ((grid <= 0) || (maxTranslateLength <= 0) || (moves < 0)) {
            System.out.println("Illegal Parameters!");
            System.exit(0);
        }

    }


    /**
     * Generates random coordinates for the animal inside the grid
     * @param animal takes an animal (pray or predator) as an argument
     * @param grid is the border of the grid
     */
    private static void generateCoordinates(Point animal, final int grid) {
        // Iterate through both coordinates; x and y
        for (int i = 0; i < 2; i++) {
            // Update the animals' location
            animal.setLocation(generateRandomInt(0, grid), generateRandomInt(0, grid));
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
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }


    /**
     * isMatchingPositions:
     * This method check to see if the current coordinates of the pray and predator matches.
     * In the case they match, the program prints a confirmation and terminates.
     */
    private static void isMatchingPositions(Point pray, Point predator) {
        // Compare points
        if (pray.equals(predator)) {
            // Successfully completed program
            System.out.println("Catch!");
            System.exit(1);
        }
    }


    /**
     * Moves (translates) the pray
     * @param pray the pray
     * @param randomInt a random integer that moves the pray
     */
    private static void movePray(Point pray, int randomInt, final int grid) {
        // Translate pray (move from current position)
        pray.translate(randomInt, randomInt);

        // Check pray is still inside grid
        moveInsideGrid(pray, grid);
    }


    /**
     * Moves the predator
     */
    private static void movePredator(Point predator, Point pray, final int maxTranslateLength) {

        int distanceX = (int) Point.distance(predator.x, 0, pray.x,  0);
        int distanceY = (int) Point.distance(0, predator.y, 0,  pray.y);

        // Translate the predator the optimal distance towards the pray

        // If distance to pray is less
        // TODO - check that predator doesn't escape the grid
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

        // Alternatively we could have calculated the direction first and used that to make it a tiny bit more readable

    }


    /* moveInsideGrid:
     * We actually only have to check if the pray is inside the box.
     * As long as the pray doesn't find a way to exit the grid,
     * the predator can not escape as well, because of the implementation,
     * that the predator never exceeds the prays' coordinates.
     */
    private static void moveInsideGrid(Point animal, final int grid) {
        int animalX = animal.x;
        int animalY = animal.y;

        // Simple comparisons to check pray is inside the given border and if not then move it inside.
        // TODO - Theres a big error here allowing the animals to escape the grid.
//        if (animalX > grid) {
//            animal.move(grid, animalY);
//        } else if (animalX < 0) {
//            animal.move(0, animalY);
//        }

        if (animalX >= grid) {
            animal.setLocation(grid, animalY);
        }
        if (animalX <= 0) {
            animal.setLocation(0, animalY);
        }

        if (animalY > grid) {
            animal.move(animalX, grid);
        } else if (animalY < 0) {
            animal.move(animalX, 0);
        }

    }


    /**
     * Prints the current coordinates of the pray and then the predator.
     */
    private static void printPositions(Point pray, Point predator) {
        System.out.println("["+pray.x+";"+pray.y+"] ["+predator.x+";"+predator.y+"]" );
    }

}
