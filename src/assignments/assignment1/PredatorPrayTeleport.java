package assignments.assignment1;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author Victor Hyltoft - s214964
 * 
 */

public class PredatorPrayTeleport {
	
	public static void main(String[] args) {
		
		runSimulation(23, 3, 100);
	}
	
	
	/* runSimulation
	 * TODO describe 
	 */
	public static void runSimulation(int n, int s, int t) {
		
		// Intitialize immutable objects (constants) to prevent accidental altering.
		final int maxBorder = n;
		final int minBorder = 1;
		final int maxMoveLength = s;
		final int iterations = t;

		// check parameters are valid.
		parameterValidation(maxBorder, maxMoveLength, iterations);
		
		/* Initialize array to store the animal's location;
		 * animal[0] = x, animal[1] = y
		 */
		int[] pray = {0, 0};
		int[] predator = {0, 0};
		
		
		// Create random start positions for the pray and predator		
		for (int i = 0; i < pray.length; i++) {
			pray[i] = generateRandomInt(minBorder, maxBorder);
			predator[i] = generateRandomInt(minBorder, maxBorder);
		}
		
		
		// Printing the start positions
		printPositions(pray, predator);
		
		/*
		 * In case iteration = 0, the loop won't run therefore we will have to check if positions match
		 */
		isMatchingPositions(pray, predator);

		// Run through all moves to be performed
		for (int i = 0; i < iterations; i++) {
			// Check positions match 
			isMatchingPositions(pray, predator);
			
			// Move predator
			movePredator(predator, pray, maxMoveLength);
			
			// Move pray
			movePray(pray, generateRandomInt(-maxMoveLength, maxMoveLength), minBorder, maxBorder);
			
			/* 
			 * We actually move the predator before the pray.
			 * This is done as the predator moves in relation to the current position of the pray.
			 * If we first call movePray, the predator would move towards the new coordinates 
			 * of the pray instead, which is unwanted behavior in our program. 
			 */
			
			// Print current positions for pray and predator
			printPositions(pray, predator);
			
		}
		
	}
	
	
	/* parameterValidation:
	 * Validates the given parameters. 
	 * Note: We use the private keyword to encapsulate our methods we haven't 
	 * planned to expose to other classes as this is best practice. 
	 */
	private static void parameterValidation(final int maxBorder, final int maxMoveLength, final int iterations) {
		
		if ((maxBorder <= 0) || (maxMoveLength < 2) || (iterations < 0)) {
			System.out.println("Illegal Parameters!");
			System.exit(0);
		}	
	}
	
	
	
	/* generateRandomInt:
	 * Pretty self-explanatory.
	 * We use the Random.nextInt() instead of Math.random() to generate the random integer
	 * as it both requires less processing and is "less biased" (but still negligible). 
	 * https://stackoverflow.com/a/738651/360211 
	 */
	private static int generateRandomInt(int min, int max) {
		// Credits: Greg Case (Stack Overflow)
		return ThreadLocalRandom.current().nextInt(min, max + 1);
	}
	
	
	/* isMatchingPositions:
	 * This method check to see if the current coordinates of the pray and predator matches.
	 * The way we do this is to compare the two arrays and see if the content is identical. 
	 * In the case they match, the program prints a confirmation and terminates.
	 */
	private static void isMatchingPositions(int[] pray, int[] predator) {
		// Compare arrays
		if (Arrays.toString(predator).equals(Arrays.toString(pray))) {
			System.out.println("Catch!");
			System.exit(1);
		}
	}
	
	
	/* movePray:
	 * TODO
	 */
	private static void movePray(int[] pray, int randomInt, final int minBorder, final int maxBorder) {
		// Pray moves by having a random value from [-s; s] added to both its coordinates
		for (int i = 0; i < pray.length; i++) {
			// Update value
			pray[i] += randomInt;
			// Check new value is inside border of grid
			pray[i] = isInsideGrid(pray[i], minBorder, maxBorder);
			
		}
	}
	
	
	/* movePredator:
	 * TODO explain movePredator
	 */
	private static void movePredator(int[] predator, int[] pray, final int maxMoveLength) {

		// Iterate through each coordinate position of the predator
		for (int i = 0; i < predator.length; i++) {
			
			// Calculate the direction and distance 
			int vectorDifference = pray[i] - predator[i];
			int distance = Math.abs(vectorDifference);
			
			// Move the predator the optimal distance towards the pray
			if (Math.abs(distance) <= maxMoveLength) {
				predator[i] += vectorDifference;
			}
			else {
				// We check to see in what direction the predator should be heading to catch the pray
				if (vectorDifference < 0) {
					predator[i] -= maxMoveLength;
				} else {
					predator[i] += maxMoveLength;
				}
			}
		}

	}
	
	
	/* isInsideGrid:
	 * We actually only have to check if the pray is inside the box.
	 * As long as the pray doesn't find a way to exit the Matrix (reference)
	 * the predator can not escape as well, because of the implementation, 
	 * that the predator never overshoots the pray's coordinates. 
	 */
	private static int isInsideGrid(int prayCoordinate, final int minBorder, final int maxBorder) {
		// Simple comparisons to check pray is inside the given border.
		if (prayCoordinate > maxBorder) {
			prayCoordinate = maxBorder;
		}
		else if (prayCoordinate < minBorder) {
			prayCoordinate = minBorder;
		}
		return prayCoordinate;
	}
	
	
	/* printPositions:
	 * Prints the current coordinates of the pray and then the predator.
	 */
	private static void printPositions(int[] pray, int[] predator) {
		System.out.println(Arrays.toString(pray) + " " + Arrays.toString(predator));
	}

}
