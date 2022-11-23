package lesson17;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

// 1-st (1-3) task

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

// 4-th task

        String stringData = "What is Java technology and why do I need it? Java is a programming language and computing platform first released by Sun Microsystems in 1995. It has evolved from humble beginnings to power a large share of today’s digital world, by providing the reliable platform upon which many services and applications are built. New, innovative products and digital services designed for the future continue to rely on Java, as well.";
        stringData = stringData.replaceAll("[^a-zA-Z ]", "");
        String[] arrayOfStrings = stringData.split(" ");

        List<String> sortedStringData = Stream.of(arrayOfStrings)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .toList();

        System.out.println("Sorted string by theirs lengths: " + sortedStringData);

// 5-th task

        ArrayList<String> list = new ArrayList<>(4);
        list.add("Highload");
        list.add("High");
        list.add("Load");
        list.add("Highload");

        long howManyHigh = Stream.of(list)
                .filter(s -> s.contains("High"))
                .count();

        System.out.println("Number of word High: " + howManyHigh);

// 6-th task

        String wordsToSort = "What is Java technology and why do I need it? Java is a programming language and computing platform first released by Sun Microsystems in 1995. It has evolved from humble beginnings to power a large share of today’s digital world, by providing the reliable platform upon which many services and applications are built. New, innovative products and digital services designed for the future continue to rely on Java, as well.";
        wordsToSort = wordsToSort.replaceAll("[^a-zA-Z ]", "");
        List<String> separateWords = new ArrayList<>(List.of(wordsToSort.split(" ")));

        long nonRepeatedWords = separateWords
                .stream()
                .distinct()
                .count();

        long wordsWithLengthLessThree = separateWords
                .stream()
                .filter(s -> s.length() < 3)
                .count();

        List reversedWords = separateWords
                .stream()
                .filter(s -> s.length() % 2 == 0)
                .map(s -> new StringBuilder(s).reverse())
                .toList();

        List capitalizedAndReplaced = separateWords
                .stream()
                .map(String::toUpperCase)
                .map(s -> s.replace("A", "#"))
                .map(s -> s.replace("O", "#"))
                .toList();

        Map sortedUniqueWords = separateWords
                .stream()
                .mapMultiToInt();

        System.out.println("Number of unique words: " + nonRepeatedWords);
        System.out.println("Number of words with length less than 3: " + wordsWithLengthLessThree);
        System.out.println("Reversed words, which length is divisible by 2: " + reversedWords);
        System.out.println("Words capitalized and symbols A and O replaced with #: " + capitalizedAndReplaced);

    }

}
