package assignments.assignment3.exercise2;

import java.awt.*;

import static assignments.assignment3.exercise2.PeberholmConstantsAndUtilities.*;

public class Flower extends Plant {
    public Flower(Point legalRandomPosition) {
        super(legalRandomPosition);
    }

    @Override
    public Plant[] spreadSeeds() {
        return createSeeds(FLOWER_SEED_NO, FLOWER_RANGE);
    }

    @Override
    protected Plant newSeed(int xCoords, int yCoords) {
        return new Flower(new Point(xCoords, yCoords));
    }

    @Override
    public Color getColor() {
        return FLOWER_COLOR;
    }

    @Override
    public String toString() {
        return "Flower " + super.toString();
    }
}
