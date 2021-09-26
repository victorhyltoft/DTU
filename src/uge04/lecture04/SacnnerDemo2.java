package uge04.lecture04;

import java.util.Scanner;

public class SacnnerDemo2 {
	
	// Declare scanner as class Variable, so it can
	// be used in all methods.
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		testScanner();
	}

	private static void testScanner() {
		System.out.print("Write your name: ");
		String name = input.next();
		System.out.println("Welcome "+name);
		
		System.out.print("Write an integer number: ");
		int num = input.nextInt();
		System.out.println(num +" squared is  "+ num*num);
		
	}
	
	

}
