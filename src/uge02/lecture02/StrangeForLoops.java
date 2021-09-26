package uge02.lecture02;

public class StrangeForLoops {

	public static void main(String[] args) {
		loop3();
	}

	public static void loop1() {
		int k = 27;
		for (; k + 100 > 2 * k; k++) {
			System.out.println("k=" + k);
		}
		
	}

	public static void loop2() {
		for (int k = 11; k != 100; k = k + 2) {
			System.out.println("k=" + k);
		}
		
	}

	public static void loop3() {
		for (int k = 1; k < 10; k++) {
			k = k / 2;
			System.out.println("k=" + k);
		}
	}

	public static void loop4() {
		for (int k = 1;;) {
			System.out.println("k=" + k);
		}
	}
	
	public static void loop5() {
		int k = 0;
		for (int i = 1; k < 100; i = i + 1) {
			k = k + i;
			System.out.println("k=" + k);
		}
		System.out.println("After loop k="+k);
	}

}
