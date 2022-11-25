package lesson16;

public class OddNumbers extends Thread{
    private String threadName;
    public OddNumbers(String threadName) {
        this.threadName = threadName;
    }
    @Override
    public void run() {
        printOddNumbers();
    }
    private synchronized void printOddNumbers() {
        for (int i = 0; i <= 9; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " -> " + getThreadName());
            }
        }
    }

    public String getThreadName() {
        return threadName;
    }
}
