package uge03.exercises;

import java.util.Scanner;

/**
 * @author Paul Fischer
 * @author Victor Hyltoft
 * 
 */
public class Exercise2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Input start value");
        int start = scanner.nextInt();
	    System.out.println("Input end value");
        int end = scanner.nextInt();
        int sum = computeSum(start,end);
        System.out.println("Sum is of integers from "+start+" to "+
        end+" is "+sum);
        scanner.close();
	}
    
    // Implement method  computeSum  here.
	public static int computeSum(int start, int end) {
		int currentSum = start;
		for (int i = end-start; i > 0; i--) {
			currentSum += start + i;
		}
		return currentSum;
	}
}

