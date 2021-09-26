package uge02.lecture02;

public class RecursionPreview {
	static int j = 0;

	public static void main(String[] args) {
		method1();
	}

	private static void method1() {
		System.out.println("Here is method1. " + j);
		j++;
		// and now it calls itself.
		method1();
	}
}
