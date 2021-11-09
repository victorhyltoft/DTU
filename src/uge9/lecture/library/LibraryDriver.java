package uge9.lecture.library;

public class LibraryDriver {

	public static void main(String[] args) {
		Library lib = new Library("DTU-lib",4);
		NonFictionBook b1 = new  NonFictionBook("Intro prog", "Reges", 1231231231234L, 01, "IT");
		NonFictionBook b2 = new  NonFictionBook("Intro Algo", "Corman", 1233435231237L, 02, "IT");
		FictionBook b3 = new  FictionBook("Tom Saywer", "Twain", 1233435231299L, 03, "Story");
		
			
		lib.addBook(b1);
		lib.addBook(b2);
		lib.addBook(b3);
		System.out.println(lib.toString());

	}

}
