package assignments.assignment1;

/**
 * @author Victor Hyltoft - s214964
 * 
 */

public class NumberCheck {

	public static void main(String[] args) {
		System.out.println("TRUE:");

		System.out.println(check("01230"));
		System.out.println(check("3475"));
		System.out.println(check("003475"));
		System.out.println(check("347500"));
		System.out.println(check("34753475"));
        System.out.println(check("2014"));
        System.out.println(check("0"));

		System.out.println("FALSE:");
        System.out.println(check(""));
        System.out.println(check("1234"));

	}

	public static boolean check(String number) {

		// In case string is empty ("")
		if (number.length() < 1) {
			return false;
		}

		// We calculate the cross sum as we iterate through the numbers in the string.
		int sum = 0;
		// Iterate through all the chars in the number-string.
		for (int i = 0; i < number.length(); i++) {
			// Get the char in the number-string in reverse order.
			char currentChar = number.charAt(number.length() - i - 1);

			// Convert ascii value to integer
			int intValue = (int) currentChar % '0';
//			System.out.println(intValue);

			// If index is odd, double the integer
			if (i % 2 != 0) {
				intValue *= 2;
				// In case twice the integer >= 10, then take mod 10
				if (intValue >= 10) {
					sum += intValue % 10 + 1;
				// In case twice the int is lower than 10.
				} else sum += intValue;
			} else sum += intValue;
		}
		return sum % 10 == 0;
		}

}


