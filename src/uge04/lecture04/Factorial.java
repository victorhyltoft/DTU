package uge04.lecture04;
public class Factorial {

	public static void main(String[] args) {
		int f5 = factorial(5);
		int f12 = factorial(22);

		System.out.println(f5 + "  " + f12+ "  "+
				factorial(1));
	}

	public static int factorial(int x) {
		int result = 1;
	//	int bla = 23;
		for (int i = 2; i <= x; i++) {
			result = result * i;
		}

		return result;

	}

}
