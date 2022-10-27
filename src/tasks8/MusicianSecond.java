package tasks8;

public class MusicianSecond implements Violin {

    private String name;

    public MusicianSecond(String name) {
        this.name = name;
    }

    public String sound(){
        return getName() + " can play on " + " violin, and violin sounds warm, lyrical, rich, clear, deep, smooth, brilliant.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
