package lesson7;

public class Advanced extends English {
    public Advanced (int amountOfWords, int times) {
        super(amountOfWords, times);
    }

    @Override
    public int requiredWords() {
        return getAmountOfWords() * 6 ;
    }

    @Override
    public int requiredTimes() {
        return getTimes() * 12;
    }

    @Override
    public String information() {
        return "At this level you need to know " + requiredWords() + " words and " + requiredTimes() + " times.";
    }
}
