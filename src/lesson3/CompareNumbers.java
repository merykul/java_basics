package lesson3;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        int a, b;
        System.out.println("Enter first number for comparing: ");
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        System.out.println("Enter second number: ");
        b = scan.nextInt();

        if (a > b) {
            System.out.println("First number is bigger");
        } else if (a < b) {
            System.out.println("First number is smaller than second number");
        } else if (a == b) {
            System.out.println("First number equals second number");
        }

    }
}
