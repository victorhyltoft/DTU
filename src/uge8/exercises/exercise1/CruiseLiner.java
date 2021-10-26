package uge8.exercises.exercise1;

public class CruiseLiner extends Ship {
    private int noOfPassengers;

    public CruiseLiner(String name, int length, int noOfPassengers) {
        super(name, length);
        this.noOfPassengers = noOfPassengers;
    }

    public CruiseLiner() {
        super();
        this.noOfPassengers = 0;
    }

    @Override
    public int getLength() {
        return super.getLength();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    @Override
    public String toString() {
        return super.toString() + "  cruise liner with "+noOfPassengers+" passenger capacity";
    }
}
