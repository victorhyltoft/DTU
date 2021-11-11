package assignments.assignment3.exercise2;

import java.awt.*;

import static assignments.assignment3.exercise2.PeberholmConstantsAndUtilities.MOSS_COLOR;

public class Moss extends Plant {
    public Moss(Point legalRandomPosition) {
        super();
    }

    @Override
    public Plant[] spreadSeeds() {
        return new Plant[0];
    }

    @Override
    public Color getColor() {
        return MOSS_COLOR;
    }
}
