package assignments.assignment3.exercise2;

import java.awt.*;

import static assignments.assignment3.exercise2.PeberholmConstantsAndUtilities.*;

public class Bush extends Plant {

    // Constructor
    public Bush(Point legalRandomPosition) {
        super(legalRandomPosition, BUSH_COLOR);
    }

    @Override
    public Plant[] spreadSeeds() {
        return createSeeds(BUSH_SEED_NO, BUSH_RANGE);
    }

    @Override
    protected Plant newSeed(int xCoords, int yCoords) {
        return new Bush(new Point(xCoords, yCoords));
    }

    @Override
    public String toString() {
        return "Bush " + super.toString();
    }
}
