package tasks8;

public interface Piano extends Instrument{
    public default String sound(){
        return "Piano sounds sweet, round, dark, and rich.";
    }
}
