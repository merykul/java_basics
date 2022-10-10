package lesson3;

import java.util.Scanner;

public class ChangeNumber {
      public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          long octalNum, decimalNum = 0;
          int i = 0;
          System.out.print("Введіть восьмерічне число: ");
          octalNum = in.nextLong();
          while (octalNum != 0)
          {
              decimalNum = (long)(decimalNum + (octalNum % 10) * Math.pow(8, i++));
              octalNum = octalNum / 10;
          }
          System.out.print("Число перетворене в десятирічне: " + decimalNum);
      }
}
