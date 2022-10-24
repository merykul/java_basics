package lesson7;

public abstract  class English {
    private int amountOfWords;
    private int times;
    public English(int amountOfWords, int times) {
        this.amountOfWords = amountOfWords;
        this.times = times;
    }
    public abstract int requiredWords ();
    public abstract int requiredTimes ();
    public abstract String information();

    public int getAmountOfWords() {
        return amountOfWords;
    }
    public int getTimes() {
        return times;
    }
    public void setAmountOfWords(int amountOfWords) {
        this.amountOfWords = amountOfWords;
    }
    public void setTimes(int times) {
        this.times = times;
    }
}
