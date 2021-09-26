package uge03.exercises;

import java.util.*;

public class Exercise7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your full name:");
		String firstname = sc.next();
		String lastname = sc.next();
		System.out.print("Your name in reverse order is " + lastname + ", " + firstname);
		sc.close();
	}

}
