package assignments.assignment3.exercise2;

import java.awt.*;

import static assignments.assignment3.exercise2.PeberholmConstantsAndUtilities.*;

public class Moss extends Plant {

    // Constructor
    public Moss(Point legalRandomPosition) {
        super(legalRandomPosition, MOSS_COLOR);
    }

    @Override
    public Plant[] spreadSeeds() {
        return createSeeds(MOSS_SEED_NO, MOSS_RANGE);
    }

    @Override
    protected Plant newSeed(int xCoords, int yCoords) {
        return new Moss(new Point(xCoords, yCoords));
    }

    @Override
    public String toString() {
        return "Moss " + super.toString();
    }
}
