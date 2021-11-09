package assignments.assignment3.exercise1;

public class FreightPlane extends Plane {
    private int payload;
    /**
     * @param manufacturer
     * @param type
     */
    public FreightPlane(String manufacturer, String type, int payload) {
        super(manufacturer, type);
        this.payload = payload;
    }

    @Override
    public String toString() {
        return super.toString() + " payload:" + this.payload;
    }
}
