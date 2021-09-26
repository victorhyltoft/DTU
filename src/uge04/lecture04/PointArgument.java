package uge04.lecture04;

import java.awt.Point;


public class PointArgument {
		
		/* Demonstrates, that a reference to a Point-object is passed to the method.
		 * The method can change THE DATA IN THE OBJECT (here the coordinates).
		 * The change is then visible in "mother"-method (main).
		 */
		public static void main(String[] args) {
			Point p = new Point(21,27);
			System.out.println("main: value of p before call of mirrorOnYAxis "+p.toString());
			mirrorOnYAxis(p);
			System.out.println("main: value of p after call of mirrorOnYAxist "+p.toString());
		}
		
		
		public static void mirrorOnYAxis(Point a){
			System.out.println("  mirrorOnYAxis:            got "+a.toString());
			a.x = -a.x;
			System.out.println("  mirrorOnYAxis:     changed to "+a.toString());
		}

	}

