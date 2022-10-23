package lesson4;

import java.util.ArrayList;

public class MinAndMaxNumberOfArraylist {
    public static void main (String[] args) {
        ArrayList<Integer> years = new ArrayList<>(5);
        years.add(2022);
        years.add(1984);
        years.add(2003);
        years.add(2009);
        years.add(2007);

        int max = years.get(0);
        for (int i = 1; i < years.size(); i++) {
            if (max < years.get(i))
                max = years.get(i);
        }
        System.out.println("Max element is: " + max);

        int min = years.get(0);
        for (int i = 1; i < years.size(); i++) {
            if (min > years.get(i))
                min = years.get(i);
        }
        System.out.println("Min element is: " + min);
    }
}
