package uge8.exercises.exercise2;

public class PlasticBottle extends Bottle {
    private String material;

    public PlasticBottle(int volume, String content, String material) {
        super(volume, content);
        this.material = material.equals("PET") ? "PET" : "OTHER";
    }

    @Override
    public String toString() {
        return "This " + this.material+ " bottle has a volume of "+getVolume() + " and contains "+getContent();
    }
}
