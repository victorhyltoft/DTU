package assignments.assignment3.exercise2;

import java.awt.*;

import static assignments.assignment3.exercise2.PeberholmConstantsAndUtilities.getRandomIntBetween;

public abstract class Plant {
    protected Point position;
    protected Color color;

    public Plant(Point position, Color color) {
        this.position = position;
        this.color = color;
    }

    // Put abstract and non-abstract methods here.

    public String toString() {
        return "position [" + position.x + ";" + position.y + "]";
    }

    public abstract Plant[] spreadSeeds();

    public Plant[] createSeeds(int TYPE_SEED_NO, int TYPE_RANGE) {
        // Create "s" new seeds;
        Plant[] seeds = new Plant[TYPE_SEED_NO];

        // Iterate over each seed to determine the position
        for (int i = 0; i < seeds.length; i++) {
            int xCoords = getRandomIntBetween(-TYPE_RANGE, TYPE_RANGE) + position.x;
            int yCoords = getRandomIntBetween(-TYPE_RANGE, TYPE_RANGE) + position.y;
            seeds[i] = newSeed(xCoords, yCoords);
        }
        return seeds;
    }

    protected abstract Plant newSeed(int xCoords, int yCoords);

    public abstract Color getColor();

    public Point getPosition() {
        return new Point(position.x, position.y);
    }


}
