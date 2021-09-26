package uge02.exercises;

public class Exercise14 {
	public static final int UPPER = 200;

	public static void main(String[] args) {
			
	int sum = 0;
	for (int i = 0; i < UPPER; i++) {
		if (i % 7 == 0) {
			sum += i;
		}
	}
	System.out.print(sum);	
	}
	
	

}
