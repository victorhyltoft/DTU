package uge9.exercises.exercise6;

import java.awt.*;

public abstract class Skakbrik extends Point {
    private final String color;
    private String type;

    public Skakbrik(int x, int y, String color) {
        // Inside specified interval
        if (0 > x || x > 7 || 0 > y || y > 7) {
            raiseException("Outside board");
        }
        setLocation(x, y);
        this.color = color;
    }

    @Override
    public void translate(int dx, int dy) {
        // Check if inside grid
        if (0 > (x + dx) || (x + dx) > 7 || 0 > (y + dy) || (y + dy) > 7) {
            raiseException("Outside board");
        }
        else {
            if (!legalMove(dx, dy)) {
                raiseException("Illegal move");
            }
            super.translate(dx, dy);
        }

    }

    protected abstract boolean legalMove(double dx, double dy);

    public void raiseException(String exception) {
        try {
            throw new IllegalArgumentException(exception);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    public String convert() {
        String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H"};
        return alpha[this.x] + (this.y + 1);
    }

    @Override
    public String toString() {
        return this.color + " " + this.type + " " + convert();
    }

    public void setType(String type) {
        this.type = type;
    }
}
