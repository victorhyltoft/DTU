package uge9.lecture.interfaces;

public class Rektangel implements Form {
	private double bredde; // felt
	private double hoejde; // felt

	// konstrukt�r
	public Rektangel(double bredde, double hoejde) {
		this.bredde = bredde;
		this.hoejde = hoejde;
	}

	public double omkreds() {
		return 2.0 * (bredde + hoejde);
	}

	public double areal() {
		return bredde * hoejde;
	}
}