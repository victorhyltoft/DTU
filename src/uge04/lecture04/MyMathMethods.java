package uge04.lecture04;

public class MyMathMethods {

	public static final double PRECISION = 0.000000001;

	public static void main(String[] args) {
		double result;
		result = power(2.2, 3);
		System.out.println(result);
		result = power(2.5, 0);
		System.out.println(result);
		result = sqrt(16.0);
		System.out.println(result);
		result = power(result, 2);
		System.out.println(result);
	}

	/* computes "x to the exp" for non-negative exp */
	private static double power(double x, int exp) {
		double result = 1.0;
		for (int i = 1; i <= exp; i++) {
			result = result * x;
		}
		return result;
	}

	/*
	 * Computes the square root of x using Newtons method. PRECISION is a class
	 * constant
	 */

	private static double sqrt(double x) {
		// here x >= 0 should be checked
		double rOld = 2;
		double rNew = 1;
		for (int i = 0; rNew - rOld > PRECISION || rOld - rNew > PRECISION; i++) {
			rOld = rNew;
			rNew = 0.5 * (rOld + x / rOld);
		}

		return rOld;
	}

}
