package uge9.exercises.exercise5;

public class Mammal extends Animal {
    @Override
    public boolean laysEggs() {
        return false;
    }

    @Override
    public int getLegs() {
        return 4;
    }
}
