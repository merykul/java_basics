package tasks8;

public class MusicianThird implements Drum {
    private String name;

    public MusicianThird(String name) {
        this.name = name;
    }

    public String sound(){
        return getName() + " can play on " + Drum.super.sound();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
