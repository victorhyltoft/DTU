package uge02.exercises;

public class Opgave270 {

	public static void main(String[] args) {
		int count = 10;
		int half = (count / 2);
		
		for (int i = 0; i < half; i++) {
			
			System.out.print(count - i + " " + i + " ");		
		}
		System.out.print(count - half + " " + half);
	}
	

}
