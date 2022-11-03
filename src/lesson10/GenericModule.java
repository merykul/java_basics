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

    interface Define<T> {
        String convert(T value);
    }

    static class Defined<T> implements GenericModule.Define {

        @Override
        public String convert(Object value) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number to convert to string: ");
            value = scan.next();
            return value.toString();
        }
    }

    //4) створити статичний вкладений клас-контейнер, який відстежує лише максимальне значення.
    //Він працює з порівнюваними об'єктами і дозволяє вводити нові значення. Щоразу, коли ви
    //вводите значення, воно зберігається, лише якщо нове значення більше ніж поточний макс.
    //       (Створити конструктор, методи put, getMax)


    static class MaxFinding<T> {
        private T maxValue;

        public MaxFinding() {

        }

        public void set(T value) {
            this.maxValue = value;
        }

        public T get() {
            return maxValue;
        }

        public T put() {
            return null;
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

