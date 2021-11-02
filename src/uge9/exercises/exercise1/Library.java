package uge9.exercises.exercise1;

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
		StringBuilder res = new StringBuilder("This is " + name + "\n");
		for (int i = 0; i < nextIndex; i++) {
			res.append(books[i].toString()).append("\n");
		}
		return res.toString();
	}
	
	public void lendBook(Book b, User customer) {
		customer.loanBook(b.getLibNumber());
	}


}
