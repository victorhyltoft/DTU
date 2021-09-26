package uge04.lecture04;

public class Oploeft {

	public static void main(String[] args) {
		int result = oploeft(3, 4);

	}

	private static int oploeft(int x, int y) {
		int z = 1;
		for (int i = 1; i <= y; i++) {
			z = z * x;
			System.out.println("i=" + i + " z=" + z);
		}
		return 0;
	}

}
