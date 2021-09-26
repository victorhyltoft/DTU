package uge04.lecture04;

public class ParaMeth {

	public static void main(String[] args) {
	    printLines(2); // call of parametrized method
	    System.out.println("---------------------");
	    printLines(5-1); // call of parametrized method
	}
	

	// parametrized method, the paramerter is "n".
	public static void printLines(int n) {
	    for (int i = 1; i <= n; i++) {
	        System.out.println("Line "+i);
	    }
	}
}
