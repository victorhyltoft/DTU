package uge02.lecture02;

public class NestedLoops {

	public static void main(String[] args) {
		nestedDemo();
	}

	private static void nestedDemo() {
		int res;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				res = i + j;
				System.out.println(i + "+" + j + " = " + res);
			}
		}

	}

}
