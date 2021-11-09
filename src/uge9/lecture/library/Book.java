package uge9.lecture.library;

public class Book {
	// fields
	private String title, author;
	private long isbn13, libNumber;

	// constructors
	public Book() {
		this.title = "NO-TITLE";
		this.author = "NO-AUTHOR";
		this.isbn13 = 0L;
		this.libNumber = -1L;
	}

	public Book(String title, String author, long isbn13, long libNumber) {
		this.title = title;
		this.author = author;
		this.isbn13 = isbn13;
		this.libNumber = libNumber;
	}

	// instance methods

	public boolean equals(Book other) {
		return this.libNumber == other.libNumber;
	}

	public String toString() {
		return "Title : " + title + "\nAuthor:" + author + "\n ISBN:"
				+ isbn13 + "  LibNo:" + libNumber;
	}
	// getter/setter methods
	public String getTitle() {
		return title;
	}

	

	public long getIsbn13() {
		return isbn13;
	}

	public long getLibNumber() {
		return libNumber;
	}
	
	public void setLibNumber(long libNumber){
		this.libNumber = libNumber;
	}
}
