package uge9.lecture.abstractclasses;

public abstract class Studerende {
	String studienummer;

	public Studerende(String studienummer) {
		this.studienummer = studienummer;
	}

	public Studerende() {
		studienummer = "";
	}

	public int normeretPoint() {
		return 60;
	}

	public int normeretTid() {
		return 1200;
	}

	String[] ferier() {
		return new String[] { "efter�rsferie", "juleferie", "vinterferie",
				"p�skeferie", "sommerferie" };
	}

	public abstract String titel(); // Has to be implemented by
	                                // ALL subklasses
}