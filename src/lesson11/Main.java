package lesson11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CheckAgeAccess {

// 1-st task

        ArrayList<Integer> userAge = new ArrayList<>();
        userAge.add(12);
        userAge.add(25);
        userAge.add(23);
        System.out.println("Age getting operation: ");
        try {
            System.out.println(userAge.get(1));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("There are only " + userAge.size() + " elements.");
        } finally {
            System.out.println("Operation of getting value from list is over.");
        }
        System.out.println("------------------------------------- \n");

// 2-nd task

        System.out.println("Access checking stage:");
        gameAccess(8);
        System.out.println("------------------------------------- \n");

// 3-rd task

        System.out.println("Account creating; age checking stage: ");
        AccountCreating account0 = new AccountCreating("Mary", "Kulyk", 19);
        AccountCreating account1 = new AccountCreating("Jon", "Snow", 14);
        System.out.println(account0.ageCheckingField(account0.getAge()));
        System.out.println(account1.ageCheckingField(account1.getAge()));
        System.out.println("-------------------------------------");

// 4-th task

        System.out.println("Account data getting");
        AccountCreating accountsNew0 = new AccountCreating("Lily", 16);

        try {
            System.out.println(accountsNew0.getLastName());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Getting user's last name operation is over.");
        }
        System.out.println("-------------------------------------");

// 5-th task
        C c = new C(45);
        A a = new A(c.getNumber());
        a.division(0);

    }

    public static void gameAccess(int age) throws CheckAgeAccess {
        if (age < 7) {
            throw new CheckAgeAccess("Your child is too young.");
        } else {
            System.out.println("Access granted - Your child is old enough.");
        }
    }
}
