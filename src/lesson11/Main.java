package lesson11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CheckAgeAccess {

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
            System.out.println("Operation of getting value from list is over. \n");
        }

// 2-nd task

        System.out.println("Access checking stage:");
        gameAccess(4);

// 3-rd task

        System.out.println("Account creating; age checking stage: ");
        AccountCreating account0 = new AccountCreating("Mary", "Kulyk", 19);
        AccountCreating account1 = new AccountCreating("Jon", "Snow", 12);
        System.out.println(account0.ageCheckingField(account0.getAge()));
        System.out.println(account1.ageCheckingField(account1.getAge()));

    }

    public static void gameAccess(int age) throws CheckAgeAccess {
        if (age < 7) {
            throw new CheckAgeAccess("Your child is too young");
        } else {
            System.out.println("Access granted - Your child is old enough. \n");
        }
    }
}
