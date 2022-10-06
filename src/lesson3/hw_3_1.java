package lesson3;

import java.util.Scanner;

    public class hw_3_1 {
        public static void main(String[] args) {

        Scanner sym = new Scanner(System.in);
        short symbol;
        System.out.println("What you would like to do?");
        System.out.println("If you want to plus number - enter 1, minus - 2, multiplication - 3, division - 4, modul - 5:");
        symbol = sym.nextShort();


        if (symbol == 1) {
            Scanner num = new Scanner(System.in);
            int first, second, result;
            System.out.println("Enter first number: ");
            first = num.nextInt();
            System.out.println("Enter second number: ");
            second = num.nextInt();
            result = first + second;
            System.out.println("Result is " + result);

        } else if (symbol == 2) {
            Scanner minus = new Scanner(System.in);
            int number1, number2, resultMinus;
            System.out.println("Enter first number: ");
            number1 = minus.nextInt();
            System.out.println("Enter second number: ");
            number2 = minus.nextInt();
            resultMinus = number1 - number2;
            System.out.println("Result is " + resultMinus);

        } else if (symbol == 3) {
            Scanner mult = new Scanner(System.in);
            int num1, num2, resultMultiple;
            System.out.println("Enter first number: ");
            num1 = mult.nextInt();
            System.out.println("Enter second number: ");
            num2 = mult.nextInt();
            resultMultiple = num1 * num2;
            System.out.println("Result of multiplication is " + resultMultiple);

        } else if (symbol == 4) {
            Scanner div = new Scanner(System.in);
            int div1, div2, resultDiv;
            System.out.println("Enter number to divide: ");
            div1 = div.nextInt();
            System.out.println("Enter divisor number: ");
            div2 = div.nextInt();
            resultDiv = div1 / div2;
            System.out.println("Result of division is: " + resultDiv);

        } else if (symbol == 5) {
            Scanner left = new Scanner(System.in);
            int l1, l2, resultLeft;
            System.out.println("Enter first number: ");
            l1 = left.nextInt();
            System.out.println("Enter second number: ");
            l2 = left.nextInt();
            resultLeft = l1 % l2;
            System.out.println("Result is " + resultLeft);
        }

    }
}
