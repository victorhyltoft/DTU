package uge9.exercises.exercise6;

public class Konge extends Skakbrik {
    public Konge(int x, int y, String color) {
        super(x, y, color);
        setType("konge");
    }

    @Override
    protected boolean legalMove(double dx, double dy) {
        return (dx == 0 || dx == 1) && Math.abs(dy) == 1 || (dy == 0 || dy == 1) && Math.abs(dx) == 1;
    }
}
