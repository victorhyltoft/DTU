package uge8.exercises.exercise2;

public class Vessel {
    private int volume;

    public Vessel(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public String toString() {
        return "This vessel has a volume of " + this.volume;
    }


}
