package assignments.assignment3.exercise2;

import java.awt.*;

import static assignments.assignment3.exercise2.PeberholmConstantsAndUtilities.FLOWER_COLOR;

public class Flower extends Plant {
    public Flower(Point legalRandomPosition) {
        super();
    }

    @Override
    public Plant[] spreadSeeds() {
        return new Plant[0];
    }

    @Override
    public Color getColor() {
        return FLOWER_COLOR;
    }
}
