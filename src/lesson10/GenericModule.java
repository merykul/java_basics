package lesson10;

import java.util.Comparator;
import java.util.Scanner;

public class GenericModule {

    // 3) Вкладений інтерфейс який оголошує типовий контракт конвертера. Він працює з двома
    // незалежними загальними типами. Він визначає метод перетворення, який приймає один
    // параметр одного типу та повертає перетворений результат іншого типу.

    interface Define<T> {
        <T1, T2> T1 convert(T1 value);
    }

    static class Defined<T1, T2> implements GenericModule.Define {

        @Override
        public T1 convert(Object value) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter number to convert to string: ");
            value = scan.next();
            return (T1) value.toString();
        }
    }

    //4) створити статичний вкладений клас-контейнер, який відстежує лише максимальне значення.
    //Він працює з порівнюваними об'єктами і дозволяє вводити нові значення. Щоразу, коли ви
    //вводите значення, воно зберігається, лише якщо нове значення більше ніж поточний макс.
    //       (Створити конструктор, методи put, getMax)


    static class MaxFinding<Number extends Comparable<Number>> {
        private Number maxValue;

        public MaxFinding(Number maxValue) {
            this.maxValue = maxValue;
        }

        public int put(Number maxValue1, Number maxValue) {
            return maxValue.compareTo(maxValue1);
        }


        public Number getMaxValue() {
            return maxValue;
        }

    }
}

