package uge9.exercises.exercise6;

public class Taarn extends Skakbrik {
    public Taarn(int x, int y, String color) {
        super(x, y, color);
        setType("taarn");
    }

    @Override
    protected boolean legalMove(double dx, double dy) {
        return dx == 0 && Math.abs(dy) >= 0 || dy == 0 && Math.abs(dx) >= 0;

    }
}
