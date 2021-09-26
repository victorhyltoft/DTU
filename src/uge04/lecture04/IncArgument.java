package uge04.lecture04;

public class IncArgument {
	
	/* Demonstrates, that a copy of the integer is passed to the method.
	 */
	public static void main(String[] args) {
		int n = 27;
		System.out.println("main: value of i before call "+n);
		incrementArgument(n);
		System.out.println("main: value of i after call  "+n);
	}
	
		public static void incrementArgument(int x){
		System.out.println("  incrementArgument:            got "+x);
		x = x + 1;
		System.out.println("  incrementArgument: incremented to "+x);
	}
    // Changing x to n in incrementArgument does not change anything. 
}
