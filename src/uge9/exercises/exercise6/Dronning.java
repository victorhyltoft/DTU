package uge9.exercises.exercise6;

public class Dronning extends Skakbrik {
    public Dronning(int x, int y, String color) {
        super(x, y, color);
        setType("dronning");
    }

    @Override
    protected boolean legalMove(double dx, double dy) {
        return Math.abs(dx / dy) == 1 || dx == 0 && Math.abs(dy) >= 0 || dy == 0 && Math.abs(dx) >= 0;

    }


}
