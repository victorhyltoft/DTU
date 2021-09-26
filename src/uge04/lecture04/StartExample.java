package uge04.lecture04;
/*
9
88
777
6666
555555
4444444
 */

public class StartExample {
	public static void main(String[] args) {
		drawPattern();
	}

	private static void drawPattern() {
	for(int line=9 ; line >= 4; line--){
		    int max = 10-line;
			for (int i = 1; i <= max; i++) {
				System.out.print(line);
			}
			System.out.println();
		}
	System.out.println();
	for(int line=1 ; line <=6; line++){
		System.out.println((line));
	}
}

}
