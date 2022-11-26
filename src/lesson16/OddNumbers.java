package lesson16;

public class OddNumbers extends Thread{
    public OddNumbers(String name) {
        super(name);
    }

    @Override
    public void run() {
        printOddNumbers();
    }
    private synchronized void printOddNumbers() {
        for (int i = 0; i <= 9; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " -> " + getName());
            }
        }
    }

}
