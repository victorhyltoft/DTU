package uge02.exercises;

public class Opgave210 {
	public static void main(String[] args) {
		
		int numbers = 10;
		int next_num = 1;
		
		for (int i = 1; i <= numbers; i++) {
			System.out.print(next_num + " ");
			next_num = next_num + (i * 2 + 1);
		}
		
	}

}
