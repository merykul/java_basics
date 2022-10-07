package lesson3;

import java.util.Scanner;

public class FactC {
    static int calculateFactorial (int n){
        System.out.println("Enter number: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(calculateFactorial(1));
    }
}
