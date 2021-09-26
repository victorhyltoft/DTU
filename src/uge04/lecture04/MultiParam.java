package uge04.lecture04;

public class MultiParam {

	public static void main(String[] args) {
		int i1 = 1;
		double d1 = 5.0;
		printSequence(4,7);
		printSequence(i1,d1);
		printSequence(1.0,5.0);
		printSequence(2.1,3.4);
		printSequence(1,19,5);
		//printSequence(-19,-17,1);
		
	}

	//Allowed: same name for different methods, but different argument types
	
	public static void printSequence(int start, int end) {
		for (int i = start; i <= end ; i += 1) {
			System.out.print(i+"|");
		}
		System.out.println();
	}
	public static void printSequence(double start, double end) {
		for (double i = start; i <= end ; i += 0.1) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	// What, if one also wants to choose the increment?

	
	public static void printSequence(int start, int end, int incr) {
		for (int i = start; i <= end ; i += incr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
