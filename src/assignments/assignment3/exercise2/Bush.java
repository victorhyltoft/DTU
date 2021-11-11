package assignments.assignment3.exercise2;

import java.awt.*;

import static assignments.assignment3.exercise2.PeberholmConstantsAndUtilities.BUSH_COLOR;

public class Bush extends Plant {
    public Bush(Point legalRandomPosition) {
        super();
    }

    @Override
    public Plant[] spreadSeeds() {
        return new Plant[0];
    }

    @Override
    public Color getColor() {
        return BUSH_COLOR;
    }
}
