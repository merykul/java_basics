package lesson3;

import static java.lang.Math.pow;

public class ArmstrongKub {
    public static void main(String[] args) {
        int ed;
        int des;
        int sot;
        int i = 1;

        for (i = 1; i <= 500; i++) {
            ed = 1 % 10;
            des = i % 100 / 10;
            sot = i / 100;
            if (pow(ed,3) +pow(des,3) +pow(sot,3) == i) {
                System.out.println(i);
            }
        }

    }

}

