package tasks8;

public interface Violin extends Instrument{
    public default String sound(){
        return "Violin sounds warm, lyrical, rich, clear, deep, smooth, brilliant.";
    }
}
