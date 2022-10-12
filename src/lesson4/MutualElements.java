package lesson4;

import java.util.ArrayList;

public class MutualElements {
    public static void main (String[] args) {
        ArrayList<Integer> firstL = new ArrayList<>();
        firstL.add(23);
        firstL.add(53);
        firstL.add(89);
        firstL.add(51);
        firstL.add(528);

        ArrayList<Integer> secondL = new ArrayList<>();
        secondL.add(825);
        secondL.add(528);
        secondL.add(456);
        secondL.add(467);
        secondL.add(123);

        firstL.retainAll(secondL);
        System.out.println("Common elements: " + firstL);


    }
}
