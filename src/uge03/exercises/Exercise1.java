package uge03.exercises;
import java.util.*;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		System.out.print(sum(first, second));
		
	}
	
	public static int sum(int first, int second) {
		return first + second;
	}

}
