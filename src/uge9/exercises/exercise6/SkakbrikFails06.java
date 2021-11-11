package uge9.exercises.exercise6;

public class SkakbrikFails06 {

    public static void main(String[] args) {
        try{
            Loeber hl1 = new Loeber(5,-3,"hvid");
            System.out.println(hl1);
        } catch (IllegalArgumentException e) {
            System.out.println("exception som forventet");
        }

    }

}


