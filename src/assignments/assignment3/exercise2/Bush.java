package assignments.assignment3.exercise2;

import java.awt.*;

import static assignments.assignment3.exercise2.PeberholmConstantsAndUtilities.*;

public class Bush extends Plant {

    public Bush(Point legalRandomPosition) {
        super(legalRandomPosition);
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
    public Color getColor() {
        return BUSH_COLOR;
    }

    @Override
    public String toString() {
        return "Bush " + super.toString();
    }


}
