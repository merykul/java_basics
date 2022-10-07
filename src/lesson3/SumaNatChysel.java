package lesson3;

public class SumaNatChysel {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s+=i;
            System.out.println("s="+s);
        }
        System.out.println("Sum is " + s);
    }
}
