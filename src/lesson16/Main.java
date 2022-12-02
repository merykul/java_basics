package lesson16;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws Exception {

// 1-st task

        Callable<Integer> task = new CallableNumber();
        task.call();

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
