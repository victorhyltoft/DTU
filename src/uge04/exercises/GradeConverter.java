package uge04.exercises;

public class GradeConverter {
	
	// Arrays with the given grades 
	static int[] old_scheme = {13, 11, 10, 9, 8, 7, 6, 5, 03, 00};
	static int[] new_scheme = {12, 12, 10, 7, 7, 4, 02, 00, 00, -3};
	
	public static int convert13to7(int grade) {
		
		for (int i = 0; i < old_scheme.length; i++) {
			if (grade == old_scheme[i]) {
				return new_scheme[i];
			}
		}
		throw new IllegalArgumentException("No such grade");
		
	}

}
