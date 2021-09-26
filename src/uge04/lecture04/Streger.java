package uge04.lecture04;

public class Streger {

	public static void main(String[] args) {
		printStreger(3);
		printStreger(4*3+1);
		printStreger(-3);
	}

	private static void printStreger(int number) {
		for (int j = 0; j < number; j++) {
			System.out.print("-");
		}
		System.out.println();
	}

}
