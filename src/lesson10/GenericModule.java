package lesson10;

import java.util.Scanner;

public class GenericModule {

    // 3) Вкладений інтерфейс який оголошує типовий контракт конвертера. Він працює з двома
    // незалежними загальними типами. Він визначає метод перетворення, який приймає один
    // параметр одного типу та повертає перетворений результат іншого типу.

    interface Define<T> {
        <T> T convert(Object value);
    }

    static class Defined<T> implements GenericModule.Define {

        @Override
        public T convert(Object value) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number to convert to string: ");
            value = scan.next();
            return (T) value.toString();
        }
    }

    //4) створити статичний вкладений клас-контейнер, який відстежує лише максимальне значення.
    //Він працює з порівнюваними об'єктами і дозволяє вводити нові значення. Щоразу, коли ви
    //вводите значення, воно зберігається, лише якщо нове значення більше ніж поточний макс.
    //       (Створити конструктор, методи put, getMax)


    static class MaxFinding<T> {
        private T maxValue;
        public MaxFinding(T value1, T value2){

        }

        public T getMax() {
            return maxValue;
        }

        public T put(T value1, T value2) {
            Scanner scanValue = new Scanner(System.in);
            System.out.println("Enter number: ");
            value1 = (T) scanValue.next();
            System.out.println("Enter second number: ");
            value2 = (T) scanValue.next();
            if ((int) value1 > (int) value2) {
                maxValue = value1;
                return maxValue;
            } else {
                maxValue = value2;
                return maxValue;
            }
        }
    }

}

