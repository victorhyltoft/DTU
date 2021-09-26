package uge04.exercises;

public class Test01 {
    public static void main(String[] args) {
        try {
            System.out.println(GradeConverter.convert13to7(0));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException");
        }
    }
}
