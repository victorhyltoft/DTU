package assignments.assignment3.exercise2;

import java.awt.*;

import static assignments.assignment3.exercise2.PeberholmConstantsAndUtilities.*;


public class Tree extends Plant {

    // Constructor
    public Tree(Point legalRandomPosition) {
        super(legalRandomPosition, TREE_COLOR);
    }


    @Override
    public Plant[] spreadSeeds() {
        return createSeeds(TREE_SEED_NO, TREE_RANGE);
    }

    public Plant newSeed(int xCoords, int yCoords) {
        return new Tree(new Point(xCoords, yCoords));
    }

    @Override
    public Color getColor() {
        return this.color;
    }

    // TODO
    @Override
    public String toString() {
        return "Tree " + super.toString();
    }

}
