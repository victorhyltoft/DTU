package uge9.exercises.exercise6;

public class Skakbriktest {
    public static void main(String[] args) {
        Loeber hl1 = new Loeber(5,3,"hvid");
        System.out.println(hl1);
        hl1.translate(2, -2);
        System.out.println(hl1);
        hl1.translate(-2, -2);
        System.out.println(hl1);

    }
}
