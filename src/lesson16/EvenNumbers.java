package lesson16;

public class EvenNumbers extends Thread{
    public EvenNumbers(String name) {
        super(name);
    }

    @Override
    public void run() {
        printEvenNumbers();
    }
    private synchronized void printEvenNumbers() {
        for (int i = 0; i <= 9; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " -> " + getName());
            }
        }
    }

}
