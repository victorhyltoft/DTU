package uge04.lecture04;

public class ProcDecompBad {

	public static void main(String[] args) {
		int sum;
		sum = 0;
		for (int i = 3; i < 20; i++) {
			sum += i;
		}
		System.out.println("sum 3 -- 20 = "+sum);
		//Other program code 
		
		sum = 0;
		for (int i = 5; i < 101; i++) {
			sum += i;
		}
		System.out.println("sum 5 -- 101 = "+sum);
		//Other program code 		
		sum = 0;
		for (int i = -77; i < 3; i++) {
			sum += i;
		}
		System.out.println("sum -77 -- 3 = "+sum);     
	}
}
