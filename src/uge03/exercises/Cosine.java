package uge03.exercises;



public class Cosine {
	public static double cosine(double x, int k) {
		
		double sum = 0;
		for (int i = 0; i <= k; i++) {
			sum += (Math.pow(-1, i) * Math.pow(x, 2*i)) / factorial(2*i);
		}
		return sum;
		
	}
	
	public static int factorial(int number) {
    	if (number <= 1) {
    		return 1;
    	}
    	else {
    		return number * factorial(number - 1);
    	}

    	
    }

}
