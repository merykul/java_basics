package tasks8;

public interface Drum extends Instrument {
    public default String sound(){
        return "Drum can sound tight, they can have a crack, they can be snappy, bright, tight, dry.";
    }
}

