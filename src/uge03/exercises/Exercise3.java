package uge03.exercises;

import java.util.*;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxNumber = sc.nextInt();
		for (int i = 1; i <= maxNumber; i++) {
			printNumbers(i);
			
		}
		sc.close();
	}
	
	public static void printNumbers(int input) {
		System.out.print("[" + input + "]");		
	}

}
