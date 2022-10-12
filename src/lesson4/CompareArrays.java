package lesson4;
import java.util.Arrays;

public class CompareArrays {
    public static void main (String[] args) {
        int [][] Hire = { {2012, 2015, 2019, 2022},
                                   {2013, 2015, 2016, 2022},};

        int [][] Quit = { {2015, 2019, 2022},
                                   {2013, 2015, 2016,2021, 2022} };

        if (equal(Hire, Quit)) {
            System.out.println("Arrays are equal!");
        } else {
            System.out.println("Arrays aren't equal");
        }

    }

    public static boolean equal(final int[][] arr1, final int[][] arr2) {
        if (arr1 == null) {
            return (arr2 == null);
        }
        if (arr2 == null) {
            return false;
        }
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!Arrays.equals(arr1[i], arr2[i])) {
                return false;
            }
        }return true;

    }
}

