package uge8.exercises.exercise2;

public class GlasBottle extends Bottle {
    private String color;

    public GlasBottle(int volume, String content, String material) {
        super(volume, content);
        this.color = material;
    }

    @Override
    public String toString() {
        return "This "+this.color+" glas bottle has a volume of "+getVolume()+" and contains "+getContent();
    }
}
