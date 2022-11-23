package lesson17;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

// 1-st task

        int oddNumbersSum = Stream.generate(() -> new Random().nextInt())
                .limit(100)
                .filter(i -> i % 2 != 0)
                .mapToInt(i -> i).sum();

        long evenNumbersCounted = Stream.generate(() -> new Random().nextInt())
                .limit(100)
                .filter(i -> i % 2 == 0)
                .count();

        List<Integer> positiveNumbers = Stream.generate(() -> new Random().nextInt())
                .limit(100)
                .filter(i -> i > 0).toList();

        System.out.println("Sum of the odd numbers: " + oddNumbersSum);
        System.out.println("Only even numbers are counted: " + evenNumbersCounted);
        System.out.println("New collection with positive numbers: " + positiveNumbers);
    }
}
