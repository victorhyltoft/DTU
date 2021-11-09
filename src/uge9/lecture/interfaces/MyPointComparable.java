package uge9.lecture.interfaces;

public class MyPointComparable implements Comparable {
	// public class MyPointComparable {

	int x, y;
	String name;

	// constructors
	public MyPointComparable() {
		x = 0;
		y = 0;
		name = "undefined";
	}

	public MyPointComparable(int xC, int yC, String n) {
		x = xC;
		y = yC;
		name = n;
	}

	public MyPointComparable(int xC, int yC) {
		x = xC;
		y = yC;
		name = "undefined";
	}

	// instance methods

	public void translate(int dx, int dy) {
		x += dx;
		y += dy;
	}

	public void setName(String n) {
		name = n;
	}

	public String toString() {
		return name + "[" + x + ";" + y + "]";
	}

	public int compareTo(Object other) {
		if (other instanceof MyPointComparable) {
			MyPointComparable otherPt = (MyPointComparable) other;
			if (this.x < otherPt.x) {
				return -1;
			} else if (this.x > otherPt.x) {
				return 1;
			} else {
				return 0;
			}
		}else { //other is not a MyPointComparable
			// Warning
			return 0;
		}
	}

}
