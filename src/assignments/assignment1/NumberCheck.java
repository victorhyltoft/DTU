package assignments.assignment1;

/**
 * @author Victor Hyltoft - s214964
 * 
 */

public class NumberCheck {

	public static void main(String[] args) {
        System.out.println(check("3475"));
        System.out.println(check("1234"));
        System.out.println(check("1234a"));
        System.out.println(check("1234b"));
        System.out.println(check("1234c"));
        System.out.println(check("003475"));
        System.out.println(check("347500"));
        System.out.println(check(""));
	}

	public static boolean check(String number) {

		try {
			// First we make sure that all characters in the string are integers.
			Integer.parseInt(number);
			// Alternatively we could have checked each char with an if-statement containing
			// "isDigit()", but this is a more elegant solution with less branching.
		} catch (NumberFormatException e) {
			// In case Integer.parseInt fails, there is a non-digit in the string
			return false;
		}

		// TODO
		// Edgecases
		// If string doesn't contain numbers
		// If string is empty; ""
		// If sum overflows (maybe use long datatype instead of int)


		// We calculate the cross sum as we iterate through the numbers in the string.
		int sum = 0;
		// Iterate through all the chars in the number string (in reverse order).
		for (int i = number.length(); i > 0; i++) {
			char currentChar = number.charAt(i);

			// Convert ascii value to integer
			int intValue = (int) currentChar % '0';

			// If index is odd, double the integer
			if (i % 2 == 0) {
				int intValueTimesTwo = intValue * 2;
				// In case twice the integer >= 10, then take modulus
				if (intValueTimesTwo >= 10) {
					sum += intValueTimesTwo % 10 + 1;
				} else {
					sum += intValueTimesTwo;
				}
			}
			// In case twice the int was lower than 10.
			else {
				sum += intValue;
			}
		}
		return sum % 10 == 0;
		}

}


