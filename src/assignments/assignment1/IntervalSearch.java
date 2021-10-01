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
		// Determine the upper and lower bounds.
		// This is simply done to simplify the comparison condition
		int upper, lower;
		if (g1 < g2) {
			upper = g2;
			lower = g1;
		} else {
			upper = g1;
			lower = g2;
		}

		// Find the double for the n'th (b'th) root for both intervals
		double tmp = Math.floor(Math.pow(upper, 1.0 / b));
		double tmp2 = Math.floor(Math.pow(lower, 1.0 / b));

		// Calculate the max pow of b,
		int pow1 = (int) Math.pow(b, tmp);
		int pow2 = (int) Math.pow(b, tmp2);

		return (upper >= pow1) && (lower <= pow1);
		
	}
}
