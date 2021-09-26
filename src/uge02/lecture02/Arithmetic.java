package uge02.lecture02;

public class Arithmetic {

	public static void main(String[] args) {
          arithmetic();
	}

	private static void arithmetic() {
		int result;
		int a = 3, b = 7, c = 0;
		System.out.println("a = "+a+"  b = "+b+"  c = "+c);
		result = a + b;
		System.out.println("a + b = "+result );
		result = a * b;
		System.out.println("a * b = "+result );
		result = b / a;
		System.out.println("b / a = "+result );
		result = b % a;
		System.out.println("b % a = "+result );		
		result = b / c;
		System.out.println("b / c = "+result );		
	}

}
