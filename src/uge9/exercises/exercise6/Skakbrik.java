package uge9.exercises.exercise6;

import java.awt.*;

public abstract class Skakbrik extends Point {
    private int x;
    private int y;
    private final String color;
    private String type;

    public Skakbrik(int x, int y, String color) {
        // Inside specified interval
        if (0 > x || x > 7 || 0 > y || y > 7) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        this.x = x;
        this.y = y;
        this.color = color;
    }

    @Override
    public void translate(int dx, int dy) {
        validateMove();
        super.translate(dx, dy);
        // Inside grid
        if (0 > x || x > 7 || 0 > y || y > 7) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected abstract void validateMove();

    public String convert() {
        String[] alpha = {"A", "B", "C", "D", "E", "F", "G", "H"};
        return alpha[this.x] + this.y;
    }

    @Override
    public String toString() {
        return this.color + " " + this.type + " " + convert();
    }

    public void setType(String type) {
        this.type = type;
    }
}
