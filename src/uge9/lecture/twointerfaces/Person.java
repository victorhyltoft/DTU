package uge9.lecture.twointerfaces;

public class Person implements ID, Name {

	private int idno;
	private String name;

	@Override
	public void setID(int n) {
		idno = n;
	}

	@Override
	public int getID() {

		return idno;
	}

	@Override
	public void setName(String na) {
		if (na.length() > 2) {
			name = na;
		}

	}

	@Override
	public String getName() {
		return name;
	}

}
