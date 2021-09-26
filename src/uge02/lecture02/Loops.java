package uge02.lecture02;

public class Loops {

	public static void main(String[] args) {

		for (int i = 1; // initialize the loop variable i
				i < 10; // stop when i >= 10 ...
				i = i + 1// ... otherwise increment i by 1
				) { // start of loop body

			// do something here
			// potentially dependent on i
			System.out.println("i = " + i);
		}

	/*	System.out.println("----------bala--------------");

		for (int bala = 27; bala > -8; bala = bala - 5) {
			System.out.println(bala);
		}*/

	/*	System.out.println("----------------------------");
		for (int bala = 0; bala <= 6; bala = bala + 1) {
			System.out.println(27 - bala * 5);
		}*/

		// write a loop which writes
		// 1 2 4 7 11 16 and uses a variable "res"
		System.out.println("----------------------------");
		
		/*int res = 1;
		for (int i = ; i <= ; i = i + 1) {
			???????????????
		}*/

	}
}
