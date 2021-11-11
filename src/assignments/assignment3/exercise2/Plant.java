package assignments.assignment3.exercise2;

import java.awt.*;

public abstract class Plant {
	protected Point position;
	protected Color color;

	// Put abstract and non-abstract methods here.
	
	public String toString() {
		return "position ["+position.x+";"+position.y+"]";
	}

	// TODO
	public abstract Plant[] spreadSeeds();

	//TODO abstract?
	public abstract Color getColor();

	public Point getPosition() {
		// TODO
		return new Point(position.x, position.y);
	}
}
