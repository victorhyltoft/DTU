package uge9.lecture.interfaces;

public class Cirkel implements Form {
	private double radius; // felt

	// konstrukt�r
	public Cirkel(double radius) {
		this.radius = radius;
	}

	// metoder
	public double omkreds() {
		return 2.0 * Math.PI * radius;
	}

	

	public double areal() {
		return Math.PI * radius * radius;
	}
}