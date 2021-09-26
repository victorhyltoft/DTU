package uge04.lecture04;


public class Scopes03 {

	public static void main(String[] args) {
		
		{int j = 27;
		System.out.println("Block before loop j = "+j);
		}
	//	System.out.println("After block  j = "+j);
		
		for (int j = 0; j < 5; j++) {
			System.out.println("In loop j = "+j);
		}		
		
		//System.out.println("After loop  j = "+j);
	}

}
