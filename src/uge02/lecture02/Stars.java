package uge02.lecture02;

public class Stars {

	public static void main(String[] args) {
		print101lines();
	}

	/* Print one line of stars */
	public static void print1line() {
		System.out.println("**********");
	}

	/* Print two lines of stars */
	public static void print2lines() {
		print1line();
		print1line();
	}

	/* Print 4 lines of stars */
	public static void print4lines() {
		print2lines();
		print2lines();
	}

	/* Got the idea ??? */
	public static void print8lines() {
		print4lines();
		print4lines();
	}

	public static void print16lines() {
		print8lines();
		print8lines();
	}

	public static void print32lines() {
		print16lines();
		print16lines();
	}

	public static void print64lines() {
		print32lines();
		print32lines();
	}

	/*
	 * Compose 100 out of the powers of 2. 100 = 64 + 32 + 4.
	 */
	public static void print101lines() {
		print64lines();
		print32lines();
		print4lines();
		print2lines();
		
	}

}
