package uge9.lecture.twointerfaces;

public class Thing implements ID, Name {

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
		if (na.startsWith("Lego")) {
			name = na;
		}

	}

	@Override
	public String getName() {
		return name;
	}

}
