package assignments.assignment3.exercise2;

import java.awt.*;

import static assignments.assignment3.exercise2.PeberholmConstantsAndUtilities.TREE_COLOR;

public class Tree extends Plant {
    public Tree(Point legalRandomPosition) {
        super();
    }

    @Override
    public Plant[] spreadSeeds() {
        return new Plant[0];
    }

    @Override
    public Color getColor() {
        return TREE_COLOR;
    }
}
