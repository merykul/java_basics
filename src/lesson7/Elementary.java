package lesson7;

public class Elementary extends  EnglishLevel {
    public Elementary (int amountOfWords, int times) {
        super(amountOfWords, times);
    }
    @Override
    public int requiredWords() {
        return getAmountOfWords() * 1 ;
    }

    @Override
    public int requiredTimes() {
        return getTimes() * 1;
    }
    @Override
    public String information () {
        return "At this level you need to know " + requiredWords() + " words and " + requiredTimes() + " time.";
    }
}
