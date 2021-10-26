package uge8.exercises.exercise1;

public class Ship {
    private String name;
    private int length;

    public Ship(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public Ship() {
        this.name = "";
        this.length = 0;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public String toString() {
        return "Ship " +name+" l="+length;
    }

}
