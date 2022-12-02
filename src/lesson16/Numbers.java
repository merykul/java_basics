package lesson16;

public class Numbers extends Thread{
    private String threadName;
    private int pause;
    public Numbers(String threadName, int pause) {
        this.threadName = threadName;
        this.pause = pause;
    }
    @Override
    public void run() {
        for (int i = 0; i <= 9; i++) {
            try {
                sleep(pause);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i + " -> " + getThreadName());
        }
    }

    public String getThreadName() {
        return threadName;
    }
}
