package lesson10;

import java.util.Scanner;

public class GenericModule {
    static class SaveWithReferences {

    }

   // 1) створити статичний вкладений клас-контейнер, який дозволяє зберігати будь-які об’єкти
   // разом із джерелом цих даних.

    static class Numbers<Number>{

    }

    // 2) створити статичний вкладений клас-контейнер, який дозволяє зберігати фактичне значення
    // разом із можливими мінімальним і максимальним значеннями. Це особлива форма трійки.
    // Усі три значення мають загальний тип, який має бути підкласом Number.

    interface Define{
        void convert(int number);
    }

    static class Defined implements GenericModule.Define{

        @Override
        public void convert(int number) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number to convert to string: ");
            number = scan.nextInt();
            System.out.println(Integer.toString(number));
        }
    }

   // 3) Вкладений інтерфейс який оголошує типовий контракт конвертера. Він працює з двома
   // незалежними загальними типами. Він визначає метод перетворення, який приймає один
   // параметр одного типу та повертає перетворений результат іншого типу.

    public static class Max{
        int i = 0;
        int b = 0;

        public void put (int i, int b){
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();
            b = scanner.nextInt();
        }

        static class MaxFinding{
            public int getMax(int i, int b){
                if (i > b){
                    return i;
                }
                else
                    return b;
            }
        }

    }

    //4) створити статичний вкладений клас-контейнер, який відстежує лише максимальне значення.
    //Він працює з порівнюваними об'єктами і дозволяє вводити нові значення. Щоразу, коли ви
    //вводите значення, воно зберігається, лише якщо нове значення більше ніж поточний макс.
    //       (Створити конструктор, методи put, getMax)
}
