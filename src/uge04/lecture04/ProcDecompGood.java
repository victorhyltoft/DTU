package uge04.lecture04;

public class ProcDecompGood {

	public static void main(String[] args) {
		computeSum(3,20);
		//Other program code 
		computeSum(5,101);
		//Other program code 	
		computeSum(-77,3);
		}
	
	
	/**
	 * Input: two integers: start, end
	 * Output: sum of integers from start throught end
	 */
	public static int computeSum(int start, int end){
		int sum = 0;
		for (int i = start; i < end; i++) {
			sum += i;
		}
		System.out.println("sum "+start+" -- "+end+" = "+sum);	
		return sum;
	}

}
