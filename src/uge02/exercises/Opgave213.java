package uge02.exercises;

public class Opgave213 {
	public static void main(String[] args) {
		int numbers = 8;
		int lines = 2;
		
		for (int i = 0; i < lines; i++) {
			for (int j = 1; j <= numbers; j++) {
				System.out.print(j * 2 + 1 + " ");
			}	
			System.out.println();
		}
				
	}
	
}

