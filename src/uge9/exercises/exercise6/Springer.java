package uge9.exercises.exercise6;

public class Springer extends Skakbrik {

    public Springer(int x, int y, String color) {
        super(x, y, color);
        setType("springer");
    }

    @Override
    protected boolean legalMove(double dx, double dy) {
        return (Math.abs(dx) == 1 && Math.abs(dy) == 2 || Math.abs(dx) == 2 && Math.abs(dy) == 1);

    }
}
