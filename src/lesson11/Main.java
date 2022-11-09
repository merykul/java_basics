package lesson11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CheckAgeGameAccess {

// 1-st task

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(25);
        numbers.add(23);
        try {
            System.out.println(numbers.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("There are only " + numbers.size() + " elements.");
        } finally {
            System.out.println("Operation is over. \n");
        }

// 2-nd task

        System.out.println("Access checking stage");
        gameAccess(5);
    }

    public static void gameAccess(int age) throws CheckAgeGameAccess {
        if (age < 7) {
            throw new CheckAgeGameAccess("Your child is too young");
        } else {
            System.out.println("Access granted - Your child is old enough.");
        }
    }
}
