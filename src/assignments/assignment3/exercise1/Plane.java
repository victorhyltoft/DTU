package assignments.assignment3.exercise1;

public class Plane {
	
	
	private static final int DEFAULT_ID = 0;
	
	protected String manufacturer, type;
	int id;
	/**
	 * @param manufacturer
	 * @param type
	 * @param id
	 */
	public Plane(String manufacturer, String type) {
		this.manufacturer = manufacturer;
		this.type = type;
		this.id = DEFAULT_ID;
	}


	public void setId(int id){
		this.id = id;
	}
	
	public String toString(){
		return "Plane" + this.id + " " + this.manufacturer + " " + this.type;
	}

	public boolean equals(Object o){
		return ((Plane) o).id == this.id;
	}
	
	public int getId() {
		return id;
	}



	
}
