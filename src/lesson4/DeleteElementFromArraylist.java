package lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class DeleteElementFromArraylist {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>(6);
        names.add("Mery");
        names.add("Iryna");
        names.add("Vira");
        names.add("Vika");
        names.add("Anna");
        names.add("Roman");

        System.out.println("List of names: ");
        for (String name : names) {
            System.out.println("Name is: " + name);
        }
        System.out.println("Chose name for deleting: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        names.remove(input);
        System.out.println("\nAfter removing the element the size of the ArrayList is: " + names.size());
        for (String name : names) {
            System.out.println("Name is: " + name);
        }
    }
}