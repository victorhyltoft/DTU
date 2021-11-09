package uge9.lecture.interfaces;

public class PolymorphyDriver {
public static void main(String[] args) {
	
	Form[] diverseFormer = new Form[4];
	
	//Form XXX = new Form();
	diverseFormer[0] = new Cirkel(5);
	diverseFormer[1] = new Cirkel(6);
	diverseFormer[2] = new Rektangel(2,3);
	diverseFormer[3] =  new Kvadrat(5);
	
	
	for (int i  = 0; i < diverseFormer.length; i++) {
		System.out.println("Area is "+diverseFormer[i].areal());
	}
}
}
