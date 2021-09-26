package uge02.lecture02;

public class Scopes03 {

	public static void main(String[] args) {
		{
			int i = 3;
			// int j = 27;
			// System.out.println("Before loop j = "+j);
			for (int j = 0; j < 5; j++) {
				System.out.println("In loop j = " + j);
				i = i + 1;
			}
		}
		//System.out.println("After loop  j = " + j);
		//System.out.println("After loop  i = " + i);
		// ------------------------------------

		{// block start 1
			int k1 = 2;
			{// block start 2
				int k2 = 5;
				System.out.println(k1 + " " + k2);
			} // block end 2; k2 "dies"
				// System.out.println(k2);
			System.out.println(k1);
		} // block end 1; k1 "dies"
			// System.out.println(k1);
	}

}
