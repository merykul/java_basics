package lesson3;

import java.util.Scanner;
public class hw_3_1 {
    public static void main(String[] args) {

        Scanner scanAction = new Scanner(System.in);
        short symbol;
        System.out.println("What you would like to do?");
        System.out.println("If you want to plus number - enter 1, minus - 2, multiplication - 3, division - 4, modul - 5:");
        symbol = scanAction.nextShort();

        Scanner num = new Scanner(System.in);
        int first, second;
        int result = 0;
        System.out.println("Enter first number: ");
        first = num.nextInt();
        System.out.println("Enter second number: ");
        second = num.nextInt();


        if (symbol == 1) {
            result = first + second;

        } else if (symbol == 2) {
            result = first - second;

        } else if (symbol == 3) {
            result = first * second;

        } else if (symbol == 4) {
            result = first / second;

        } else if (symbol == 5) {
            result = first % second;
        }

        System.out.println("Result is " + result);


        }
}
