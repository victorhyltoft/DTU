package uge02.exercises;

public class Opgave212 {

	public static void main(String[] args) {
		int height = 5;
		
		for (int i = 0; i <= height; i++) {
			
			for (int j = height ; j <= height + i; j++) {
				System.out.print(i + height - j + " ");
			}
			
			for (int j = 0; j < height - i; j++) {
				System.out.print(j + 1+ " ");
			}
			
			System.out.println();
		}

	}

}
