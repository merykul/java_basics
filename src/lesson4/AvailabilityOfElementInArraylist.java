package lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AvailabilityOfElementInArraylist {
    public static void main (String[] args) {
        System.out.println("Enter symbol to check: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        List aList = new ArrayList();
        aList.add("M");
        aList.add("E");
        aList.add("R");
        aList.add("Y");
        aList.add("S");
        System.out.println("Entered element is available in ArrayList? " + aList.contains(input));
    }
}
