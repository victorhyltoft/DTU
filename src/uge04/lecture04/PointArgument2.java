package uge04.lecture04;

import java.awt.Point;


public class PointArgument2 {
		
		/* Demonstrates, that a copy of  a reference to a Point-object is passed to the method.
		 * The method CAN replace the copy of the refernce to a differnt object.
		 * In the "mother"-method (main) the original reference is still pointing to
		 * the original point p.
		 */
		public static void main(String[] args) {
			Point p = new Point(21,27);
			System.out.println("main: value of p before call of replaceByNewPoint "+p.toString());
			replaceByNewPoint(p);
			//the refernce p is still the original one.
			System.out.println("main: value of p after call of replaceByNewPoint "+p.toString());
		}
		
		
		public static void replaceByNewPoint(Point p){
			System.out.println("  replaceByNewPoint:            got "+p.toString());
			Point r = new Point(1,2);
			p = r;
			//the copy of Point 'a' now points to 'r'
			System.out.println("  replaceByNewPoint:    replaced by "+p.toString());
			//the copy of 'a' sizes to exist
		}

	}

