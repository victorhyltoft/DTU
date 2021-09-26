package uge04.lecture04;

public class StringDemo {
	
	public static void main(String[] args) {
		runStringDemo("This is the text!");
	}

	public  static void runStringDemo(String text) {
		System.out.println("Original "+text);
		System.out.println("Length   "+text.length());
		// print the indeces
		System.out.print("         ");
		for (int i = 0; i < text.length(); i++) {
			System.out.print((i%10));
		}
		System.out.println();
	    String textU = text.toUpperCase();
		System.out.println("Upper    "+textU);
		// Note: "text" is unchanged, "toUpperCase" creates new string
		System.out.println("Original "+text);
		System.out.println("First index of \"is\" "+text.indexOf("is"));
		System.out.println("Substring from 3 to 9 >"+text.substring(3,9)+"<");
	}

}
