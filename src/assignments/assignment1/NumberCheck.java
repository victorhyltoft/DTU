package assignments.assignment1;

/**
 * @author Victor Hyltoft - s214964
 * 
 * 
 */

public class NumberCheck {

	public static void main(String[] args) {
        System.out.println(check("1234"));
	}
		
	
	//* ONE IMPLEMENTATION *//
	public static boolean check1(String number) {
		
		int numberAsInt = 0;
		try {
			numberAsInt = Integer.parseInt(number);
		}	
		catch (NumberFormatException ex) {
			return false;
		}
		// Continue on to make 
		System.out.println(numberAsInt);
		return true;
	}
	
	
	// The "check" method calculates the checksum 
	//* ANOTHER IMPLEMENTATION *//
	// The "problem" with this method is we have to potentially run through some if not all of the String
	// while we do computations, only to throw it all out if there's a non-digit. 
	public static boolean check(String number) {
		
		int sum = 0;
		int numberLength = number.length();
		for (int i = 1; i <= numberLength; i++) {
			char tmp = number.charAt(i - 1);
			
			if (Character.isDigit(tmp)) {
				int test = (int) tmp % 49 + 1;
//				System.out.println("tmp: " + test);
				
				// If index is odd, double the integer on the position
				if (i % 2 != 0) {
					int twiceInt = test * 2;
					if (twiceInt >= 10) {
						sum += twiceInt % 10 + 1;						
					}
					else {
						sum += twiceInt;
					}
				}
				else {
					sum += test;
				}
//				System.out.println("sum:" + sum);
				
			}
			else {
				return false;
			}
			
		}
		
//		System.out.println(sum);
		
		if (sum % 10 == 0) {
//			System.out.println("YES");
			return true;
		}
		else {
//			System.out.println("NOE");
			return false;
		}
		
		
		// Convert string to integer
		
		
			
		// Check for negative numbers
				 
		
		//*** Calculate the checksum
		// We could use a HashMap here but lets pretend we don't know about this
				

		

	}
	
	// This method validates the input 
	public static boolean validInput(String number) {
		
		return true;
		
	}

}

