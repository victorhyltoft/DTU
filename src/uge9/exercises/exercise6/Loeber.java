package uge9.exercises.exercise6;

public class Loeber extends Skakbrik {

    // Constructor
    public Loeber(int x, int y, String color) {
        super(x, y, color);
        setType("loeber");
    }

    @Override
    protected boolean legalMove(double dx, double dy) {
        return Math.abs(dx / dy) == 1;

    }
}
