package uge02.lecture02;

public class ArithmeticStrings {

	public static void main(String[] args) {
		doArithmetic();
	}

	public static void doArithmetic() {
		int a = 3;
		int b = 7;
		int c = 0;
		int res;
		System.out.println(" a = " + a + "  b = " + b + "  c = " + c);
		res = a + b;
		System.out.println(" a + b = " + res);
		System.out.println(" a + b = " + a + b);
		System.out.println(" a + b = " + (a + b));
		res = a * b;
		System.out.println(" a * b = " + res);
		System.out.println(" a * b = " + a * b);
		res = b / a;
		System.out.println(" b / a = " + res);
		System.out.println(" b / a = " + b / a);
		res = b/c;
		System.out.println(" b / c = "+res);
		
		double r = 7/2/1.5;
		System.out.println(r);
		r = 3.0/2;
		System.out.println(r);
		
		
	}

}
