package lesson10;

import java.util.Scanner;

public class GenericModule {

    // 1) створити статичний вкладений клас-контейнер, який дозволяє зберігати будь-які об’єкти
    // разом із джерелом цих даних.
    static class SaveWithReferences {

    }

    // 2) створити статичний вкладений клас-контейнер, який дозволяє зберігати фактичне значення
    // разом із можливими мінімальним і максимальним значеннями. Це особлива форма трійки.
    // Усі три значення мають загальний тип, який має бути підкласом Number.

    static class Numbers<Number> {

    }

    // 3) Вкладений інтерфейс який оголошує типовий контракт конвертера. Він працює з двома
    // незалежними загальними типами. Він визначає метод перетворення, який приймає один
    // параметр одного типу та повертає перетворений результат іншого типу.

    interface Define {
        void convert(int number);
    }

    static class Defined<T> implements GenericModule.Define {
        private T value;

        public void set(T value) {
            this.value = value;
        }

        public T get() {
            return value;
        }


        @Override
        public void convert(int number) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number to convert to string: ");
            number = scan.nextInt();
            System.out.println(Integer.toString(number));
        }
    }

    //4) створити статичний вкладений клас-контейнер, який відстежує лише максимальне значення.
    //Він працює з порівнюваними об'єктами і дозволяє вводити нові значення. Щоразу, коли ви
    //вводите значення, воно зберігається, лише якщо нове значення більше ніж поточний макс.
    //       (Створити конструктор, методи put, getMax)


    static class MaxFinding {

        public void put(int i, int b) {
        }

        public int getMax(int i, int b) {
            System.out.println("Enter number: ");
            Scanner scanner = new Scanner(System.in);
            i = scanner.nextInt();
            b = scanner.nextInt();
            if (i > b) {
                return i;
            } else
                return b;
        }
    }

}

