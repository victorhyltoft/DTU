package uge03.exercises;

public class BinCoeff {
	public static int binomial(int n, int k) {
		
		return (int) (factorial(n)/(factorial(k)*factorial(n-k)));
		
	}
	
	public static int binomialSmart(int n, int k) {
		
        if (k > n) {
        	return 0;        	
        }
        if (k == 0 || k == n) {
        	return 1;     	
        }
        
        return binomialSmart(n - 1, k) + binomialSmart(n - 1, k - 1);
		
	}
		
	public static long factorial(long number) {
    	if (number <= 1) {
    		return 1;
    	}
    	else {
    		return number * factorial(number - 1);
    	}
    }
}
