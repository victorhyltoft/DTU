package assignments.assignment1;

/**
 * @author Victor Hyltoft - s214964
 * 
 * 
 */

public class IntervalSearch {

	public static void main(String[] args) {
		//@ TestGroup
		//@ Feedback: full
		//@ Test
        System.out.println(intervalContains(5, 11, 3));
		//@ Test
		System.out.println(intervalContains(5, 11, 4));
		//@ Test
		System.out.println(intervalContains(17, 17, 17));
		//@ Test
		System.out.println(intervalContains(17, 17, 5));
		//@ Test
		System.out.println(intervalContains(12, 18, 12));
		//@ Test
		System.out.println(intervalContains(18, 12, 12));
		//@ Test
		System.out.println(intervalContains(18, 24, 12));
		//@ Test
		System.out.println(intervalContains(18, 144, 12));
		//@ Test
		System.out.println(intervalContains(18, 14403434, 12));
		//@ Test
		System.out.println(intervalContains(5, 11, 1));
		//@ Test
		System.out.println(intervalContains(1, 5, 1));
		//@ End
	}
	
	public static boolean intervalContains(int g1, int g2, int b) {
		
		// The scenario that b <= 1 and not in the interval would result in an infinite loop, 
		// thus we check for this scenario first
		if (b <= 1) {
			if (((g1 <= b) && (g2 >= b)) || ((g1 >= b) && (g2 <= b))) {
				return true;
			}
			else {
				return false;
			}
		}

		return alternative(g1, g2, b);

		// return bruteForcing(g1, g2, b);
		
	}

	// Inefficient program
	public static boolean bruteForcing(int g1, int g2, int b) {
		// Brute forcing...

		int pow_result = 1;
		// Why while-loop instead of for-loop? Because we don't know how many iterations we need to through
		while (true) {
			// Compare the power and the interval
			// We check
			if (((g1 <= pow_result) && (g2 >= pow_result)) || ((g1 >= pow_result) && (g2 <= pow_result))) {
				return true;
			}
			// Check the upper-bounds for "a" such that b^a <= (g1 or g2)
			// If this is the case, a can not be valid.
			else if ((pow_result >= g1) && (pow_result >= g2)) {
				return false;

			}
			// Check the lower-bounds
			else if ((pow_result <= g1) && (pow_result <= g2)) {
				pow_result *= b;

			}
			else {
				return false;
			}

		}
	}

	public static boolean alternative(int g1, int g2, int b) {
		// Find the n'th (b'th) root of both the interval
		double tmp = Math.floor(Math.pow(g1, 1.0 / b));
		double tmp2 = Math.floor(Math.pow(g2, 1.0 / b));

		/*
		We can either make a condition such that it takes into consideration that both g1 and g2 can be the upper and lower bound.
		Otherwise we can make check which of the two g-values are the upper and lower bounds.
		 */
		int upper, lower;
		if (g1 < g2) {
			upper = g2;
			lower = g1;
		} else {
			upper = g1;
			lower = g2;
		}

		
		System.out.println("Upper: " + upper + ", Lower: " + lower);


		int pow1 = (int) Math.pow(b, tmp);
		int pow2 = (int) Math.pow(b, tmp2);


		// true when; the first result of pow is bigger than the lowest interval and lower than the biggest interval parameter
		// or when the second result of pow is lower than the
		if (((g1 <= pow1) && (g2 >= pow1)) || ((g1 <= pow2) && (g2 >= pow2)))  {
			return true;
		}
		return false;
	}
	

}
