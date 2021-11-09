package assignments.assignment2.exercise3;

/**
 * @author Victor Hyltoft
 *
 */

public class MovingPoint {
    // Fields
    private double x;
    private double y;
    private double direction;
    private double speed;

    // Constants
    private static final double MAX_SPEED = 20;
    private static final double MIN_SPEED = 0;


    // First constructor (default)
    public MovingPoint() {
        this.x = 0;
        this.y = 0;
        this.speed = 0;
        this.direction = 90;
    }

    // Second Constructor (parameterized)
    public MovingPoint(double x, double y, double direction, double speed) {
        this.x = x;
        this.y = y;
        // Ternary expressions for getting the appropriate direction and speed;
        // Makes sure direction is in the interval [0, 360) for all numbers.
        this.direction = (direction < 0) ? (direction % 360) + 360 : direction % 360;
        // Define speed if valid (between 0 and 20) otherwise the closest const
        this.speed = (speed > MAX_SPEED) ? MAX_SPEED : Math.max(speed, MIN_SPEED);
    }

    /**
     * Instance translating the coordinates according to the current angle, speed and duration
     */
    public void move(double duration) {
        // Convert Polar coordinates to Cartesian coordinates
        double length = duration * this.speed;
        double radians = Math.toRadians(this.direction);

        this.x += length * Math.cos(radians);
        this.y += length * Math.sin(radians);
    }


    /**
     * Instance changing the direction by the given angle
     */
    public void turnBy(double angle) {
        // Converts both positive and negative angles exceeding 360
        // degrees or not to their respective values within [0; 360]
        this.direction += (angle % 360) + 360;
        this.direction %= 360;
    }

    /**
     * Instance changing the direction by the given angle (counterclockwise)
     */
    public void accelerateBy(double change) {
        double newSpeed = this.speed + change;
        // Check speed + change is between 0 and 20 then set the appropriate speed
        this.speed = (newSpeed > MAX_SPEED) ? MAX_SPEED : Math.max(newSpeed, MIN_SPEED);
    }

    // Accessors
    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double getDirection() {
        return this.direction;
    }

    public double getSpeed() {
        return this.speed;
    }


    public String toString() {
        return "[" + getX() + ";" + getY() + "] " + getDirection() + " " + getSpeed() ;
    }


}
