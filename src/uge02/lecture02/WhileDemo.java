package uge02.lecture02;

public class WhileDemo {
	
	public static void main(String[] args) {
		demo1();
		//demo2();
	}
	
	public static void demo1() {
		int i = 0;
		while(i < 5) {
			System.out.println(i);
			//i = i+2;
		}
	}
	
	public static void demo2() {
		long time = System.nanoTime();
		int counter = 0;
		while( time % 100 != 0) {
			System.out.println(time+"  "+counter);
			time = System.nanoTime();
			counter ++;
		}
	}

}
