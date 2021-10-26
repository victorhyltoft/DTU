package uge8.exercises.exercise2;

public class Bottle extends Vessel {
    private String content;

    public Bottle(int volume, String content) {
        super(volume);
        this.content = content;
    }

    @Override
    public int getVolume() {
        return super.getVolume();
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "This bottle has a volume of "+ getVolume() + " and contains "+ this.content;
    }
}
