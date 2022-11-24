package lesson16;

public class Main {
    public static void main(String[] args) throws InterruptedException {

// 2-nd task
        Thread firstThread = new Numbers("#1", 200);
        Thread secondThread = new Numbers("#2",200);
        Thread thirdThread = new Numbers("#3",250);

        thirdThread.setPriority(Thread.MAX_PRIORITY);
        firstThread.setPriority(Thread.MIN_PRIORITY);

        firstThread.start();
        secondThread.start();
        thirdThread.start();

// 3-rd task

        Thread oddNumbers = new OddNumbers("odd number");
        Thread evenNumbers = new EvenNumbers("even number");

        oddNumbers.start();
        evenNumbers.start();

    }
}
