package uge9.exercises.exercise1;

public class FictionBook extends Book {

	private String genre; // Crime, sciFi, romance ...

	public FictionBook() {
		super();
		this.genre = "Undefined";
	}

	public FictionBook(String title, String author, long isbn13, long libno, 
			String genre) {
		super(title, author, isbn13, libno);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}
	
	public String toString() {
		return super.toString()+" genre:"+genre;
	}

}
