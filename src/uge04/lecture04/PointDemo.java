package uge04.lecture04;

import java.awt.Point;

public class PointDemo {

	public static void main(String[] args) {
		Point p1 = new Point(3, 5);
		Point origin = new Point(0, 0);
		System.out.println(" p1 = " + p1);// Point's toString
		p1.translate(3, 2);
		System.out.println(" p1 = " + niceFormat(p1));
		double dist = p1.distance(origin); // distance p1 to origin
		System.out.println("Distance to origin " + dist);
		// access the x and y coordinates
		double x1 = p1.x; // x-coord of p1
		System.out.println("p1.y = " + p1.y);
		// write coordinates
		p1.x = -5;
		System.out.print("x-coord set on p1. p1 = " + niceFormat(p1));

	}

	public static String niceFormat(Point p) {
		 String result = "<" +p.x + ";" + p.y + ">";
		return result;
	}

}
