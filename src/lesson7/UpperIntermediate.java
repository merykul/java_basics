package lesson7;

public class UpperIntermediate extends EnglishLevel {
    public UpperIntermediate (int amountOfWords, int times) {
        super(amountOfWords, times);
    }

    @Override
    public int requiredWords() {
        return getAmountOfWords() * 4 ;
    }

    @Override
    public int requiredTimes() {
        return getTimes() * 10;
    }

    @Override
    public String information() {
        return "At this level you need to know " + requiredWords() + " words and " + requiredTimes() + " times.";
    }
}
