package assignments.assignment3.exercise2;

import java.awt.*;

import static assignments.assignment3.exercise2.PeberholmConstantsAndUtilities.getRandomIntBetween;

public abstract class Plant {
    // Fields
    protected Point position;
    protected Color color;

    // Parameterized Constructor
    public Plant(Point position, Color color) {
        this.position = position;
        this.color = color;
    }

    // A method defined in the PeberholmSimulation
    public abstract Plant[] spreadSeeds();

    /**
     * This method creates new seeds for the type of plant it was called from.
     * @param TYPE_SEED_NO defines the number of new seeds
     * @param TYPE_RANGE defines the range
     * @return a list of seeds of the class type it was called from
     */
    public Plant[] createSeeds(int TYPE_SEED_NO, int TYPE_RANGE) {
        // Create "s" new seeds;
        Plant[] seeds = new Plant[TYPE_SEED_NO];

        // Iterate over each seed to determine the new positions
        for (int i = 0; i < seeds.length; i++) {
            int xCoords = getRandomIntBetween(-TYPE_RANGE, TYPE_RANGE) + position.x;
            int yCoords = getRandomIntBetween(-TYPE_RANGE, TYPE_RANGE) + position.y;
            // Convert the seeds to the specific type of plant
            seeds[i] = newSeed(xCoords, yCoords);
        }
        return seeds;
    }

    /**
     * This abstract method creates and returns a new type of plant (Tree, Flower etc.)
     * with the given coordinates.
     */
    protected abstract Plant newSeed(int xCoords, int yCoords);


    public String toString() {
        return "position [" + position.x + ";" + position.y + "]";
    }

    // Getters
    public Color getColor() {
        return this.color;
    }

    public Point getPosition() {
        return new Point(position.x, position.y);
    }


}
