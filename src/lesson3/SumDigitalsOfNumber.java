package lesson3;

import java.util.Scanner;

public class SumDigitalsOfNumber {
    public  static void main (String[] args) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        sum(n, sum);
    }
    public static void sum(int n, int sum){
        if(n != 0){
            sum += n % 10;
            sum(n/10, sum);
        } else System.out.println(sum);
    }
}

