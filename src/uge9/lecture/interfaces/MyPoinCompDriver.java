package uge9.lecture.interfaces;

import java.util.Arrays;

public class MyPoinCompDriver {

	public static void main(String[] args) {
		MyPointComparable[] array = new MyPointComparable[4];
		array[0] = new MyPointComparable(2,1,"");
		array[1] = new MyPointComparable(3,3,"");
		array[2] = new MyPointComparable(3,4,"");
		array[3] = new MyPointComparable(1,1,"");
		
		System.out.println(Arrays.toString(array));
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		

	}

}
