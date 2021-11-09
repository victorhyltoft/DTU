package uge9.lecture.abstractclasses;

public class BachelorStuderende extends Studerende {
	
	//Konstruk�r kalder konstruk�ren af superklassen
	public BachelorStuderende(String sn) {
		super(sn);
	}
	public String titel() { // overskrivning
   		return "bachelor-studerende";
    }
   

}
