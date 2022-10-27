package tasks8;

public class MusicianThird implements Drum {
    private String name;

    public MusicianThird(String name) {
        this.name = name;
    }

    public String sound(){
        return getName() + " can play on " + " drum, and drum can sound tight, they can have a crack, they can be snappy, bright, tight, dry.";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
