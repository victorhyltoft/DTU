package assignments.assignment2.exercise3;

public class MovingPoint {
    // Fields
    private double x;
    private double y;
    private double direction;
    private double speed;

    private final double MAX_SPEED = 20;
    private final double MIN_SPEED = 0;


    // First constructor
    public MovingPoint() {
        this.x = 0;
        this.y = 0;
        this.speed = 0;
        this.direction = 90;
    }

    // Second Constructor
    public MovingPoint(double x, double y, double direction, double speed) {
        this.x = x;
        this.y = y;
        this.direction = (direction < 0) ? (direction % 360) + 360 : direction % 360 ;
        this.speed = (speed > MAX_SPEED) ? MAX_SPEED : (speed < MIN_SPEED) ? MIN_SPEED : speed;
    }


    public void move(double duration) {
        // Cartesian to Polar coordinates
        double length = duration * this.speed;
        double radians = Math.toRadians(this.direction);

        this.x += length * Math.cos(radians);
        this.y += length * Math.sin(radians);
    }

    public void turnBy(double angle) {
        this.direction += (angle % 360) + 360;
        this.direction %= 360.0;
    }

    public void accelerateBy(double change) {
        double newSpeed = this.speed + change;

        if (newSpeed > MAX_SPEED) {
            this.speed = MAX_SPEED;
        } else if (newSpeed < MIN_SPEED) {
            this.speed = MIN_SPEED;
        } else this.speed = newSpeed;
    }

    public String toString() {
        return "[" + this.x + ";" + this.y + "] " + this.direction + " " + this.speed ;
    }


}
