package lesson7;

public class Intermediate extends EnglishLevel {
    public Intermediate (int amountOfWords, int times) {
        super(amountOfWords, times);
    }
    @Override
    public int requiredWords() {
        return getAmountOfWords() * 3;
    }

    @Override
    public int requiredTimes() {
        return getTimes() * 8;
    }

    @Override
    public String information() {
        return "At this level you need to know " + requiredWords() + " words and " + requiredTimes() + " times.";
    }
}
