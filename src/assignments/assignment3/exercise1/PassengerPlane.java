package assignments.assignment3.exercise1;

public class PassengerPlane extends Plane {
    private int seats;

    /**
     * @param manufacturer
     * @param type
     */
    public PassengerPlane(String manufacturer, String type, int seats) {
        super(manufacturer, type);
        this.seats = seats;
    }

    @Override
    public String toString() {
        return super.toString() + " seats:" + this.seats;
    }


}
