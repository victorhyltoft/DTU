package uge9.lecture.library;

public class Library {

	private String name;
	private long nextLibNo = 1000; // minimum libNumber
	private Book[] books;
	private int libSize, nextIndex;

	public Library(String name, int libSize) {
		this.name = name;
		this.libSize = libSize;
		books = new Book[libSize];
		nextIndex = 0;
	}
	
	public boolean addBook(Book b){
		if(nextIndex < libSize){
			b.setLibNumber(nextLibNo);
			nextLibNo++;
			books[nextIndex] = b;
			
			nextIndex++;
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		String res = "This is "+name+"\n"; // Better use StringBuilder here.
		for (int i = 0; i < nextIndex; i++) {
			res += books[i].toString()+"\n";
		}
		return res;
	}
	
	//?? public boolean lendBook(Book b, User customer)
	
}
