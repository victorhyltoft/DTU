package uge8.exercises.exercise3;

import java.awt.Point;

public class Knight extends Point {

	public Knight() {
	}

	public Knight(Point p) {
		super(p);
	}

	public Knight(int x, int y) {
		// Can one use super to create a knight?
		super(x, y);
	}
	
	public void translate(int dx, int dy){
		// Check  whether tis is a lergal knight move. Otherwise do not move.
		if (Math.abs(dx) == 2 && Math.abs(dy) == 1 || Math.abs(dy) == 2 && Math.abs(dx) == 1) {
			super.translate(dx, dy);
		}
		// hint: Math.abs can be used to simplify the code.
		// hint: super to execute leags moves.
	}

	@Override
	public String toString() {
		return "Knight[x=" + super.x + ",y=" + super.y + "]";
	}
}
