package lesson3;

import java.util.Scanner;

public class ChangeNumber {
      public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          long octal_num, decimal_num = 0;
          int i = 0;
          System.out.print("Введіть восьмерічне число: ");
          octal_num = in.nextLong();
          while (octal_num != 0)
          {
              decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
              octal_num = octal_num / 10;
          }
          System.out.print("Число перетворене в десятирічне: " + decimal_num);
      }
}
