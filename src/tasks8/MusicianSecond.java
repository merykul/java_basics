package tasks8;

public class MusicianSecond implements Violin {

    private String name;

    public MusicianSecond(String name) {
        this.name = name;
    }

    public String sound(){
        return getName() + " can play on " + Violin.super.sound();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
