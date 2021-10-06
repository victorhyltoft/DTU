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

		// TODO
		// Logaritmen
		// What if b is 1?
		// Overflow???

		// Find the n'th (b'th) root
		double tmp = Math.floor(Math.pow(upper, 1.0 / b));

		// Calculate the max pow of b,
		int powResult = (int) Math.pow(b, tmp);

		// Check and return if the max pow of b is within the interval
		return (upper >= powResult) && (lower <= powResult);
		
	}
}
