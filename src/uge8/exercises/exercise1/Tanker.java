package uge8.exercises.exercise1;

public class Tanker extends Ship {
    private int barrels;

    public Tanker(String name, int length, int barrels) {
        super(name, length);
        this.barrels = barrels;
    }

    public Tanker() {
        super();
        this.barrels = 0;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getLength() {
        return super.getLength();
    }

    public int getBarrels() {
        return barrels;
    }

    @Override
    public String toString() {
        return super.toString() + "  tanker with "+barrels+" barrels capacity";
    }
}
