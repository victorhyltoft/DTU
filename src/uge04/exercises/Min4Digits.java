package uge04.exercises;

public class Min4Digits {
	
	public static String min4Digits(int n) {
		
		if (n < 0) {
			return "-" + convert(n);
		}
		else {
			return convert(n);
		}
		
	}

	public static String convert(int n) {
		// n must not be negative
		if (n < 0) {
			n = -n;
		}
		
		// Convert int to string
		String s = String.valueOf(n);
		
		int l = s.length();
		
		// Compare and return
		if (l == 1) {
			return "000" + s;
		}
		else if (l == 2) {
			return "00" + s;
		}
		else if (l == 3) {
			return "0" + s;
		}
		else {
			return s;
		}
	}

}
