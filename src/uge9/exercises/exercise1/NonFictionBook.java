package uge9.exercises.exercise1;

public class NonFictionBook extends Book {

	private String area; // Travel, technique, cooking

	public NonFictionBook() {
		super();

	}
// How to automatically generate libno-s?
	public NonFictionBook(String title, String author, long isbn13,long libno,
			String area) {
		super(title, author, isbn13, libno);
		this.area = area;
	}

	public String getArea() {
		return area;
	}
	
	public String toString() {
		return super.toString()+" area:"+area;
	}

}
