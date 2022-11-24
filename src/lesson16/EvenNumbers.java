package lesson16;

public class EvenNumbers extends Thread{
    private String threadName;

    public EvenNumbers(String threadName) {
        this.threadName = threadName;
    }
    @Override
    public void run() {
        for (int i = 0; i <= 9; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " -> " + getThreadName());
            }
        }
    }

    public String getThreadName() {
        return threadName;
    }
}
