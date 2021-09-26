package uge02.lecture02;

public class RoundingError {
	public static void main(String[] args) {
		
		// The result should be (0.1+0.2) = 0.3 but ...
		System.out.println("result = " + (0.1+0.2) );
		System.out.println((int)((0.1+0.2)*1000));
		System.out.println((double)((int)((0.1+0.2)*1000)%1000)/1000);

		// The result should be 0 but ...
		System.out.println("result = " +(0.1 + 0.2 - 0.3));
		//Computer arithmethic is NOT associative
	    System.out.println("(0.25+0.33)+0.4 = " + ((0.25+0.33)+0.4));
	    System.out.println("0.25+(0.33+0.4) = " + (0.25+(0.33+0.4)));
	}
}
