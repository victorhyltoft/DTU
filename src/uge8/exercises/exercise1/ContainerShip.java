package uge8.exercises.exercise1;

public class ContainerShip extends Ship {
    private int teu;

    public ContainerShip(String name, int length, int teu) {
        super(name, length);
        this.teu = teu;
    }

    public ContainerShip() {
        super();
        this.teu = 0;
    }

    @Override
    public int getLength() {
        return super.getLength();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public int getTeu() {
        return teu;
    }

    @Override
    public String toString() {
        return super.toString() + "  container carrier with "+teu+" TEU";
    }
}
