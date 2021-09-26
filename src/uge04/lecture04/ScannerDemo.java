package uge04.lecture04;

import java.util.Scanner; //load the Scanner class 
                          //from the utility library
public class ScannerDemo {
	
 	public static void main(String[] args) {
	    Scanner console = new Scanner(System.in);
		System.out.print("Gimmi input:");
        String input = console.next();
        input = input +console.next();
        System.out.println("Got input "+input);
		System.out.print("Gimmi input int:");
        int ii = console.nextInt();
        System.out.println("ii="+ii);
        console.close(); //to avoid zombies 
       }
}
