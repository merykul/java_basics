package lesson12;

import java.util.Optional;
import java.util.Random;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        String[] greeting = {"Hi", "hello", "", "Good evening"}; //1-st
        Predicate<String> isItEmpty = String::isEmpty;
        System.out.println(isItEmpty.test(greeting[2]));

        Supplier<String> sayHello = () -> "Hello"; // 2-nd
        print.accept(sayHello.get() + " everyone!" + "\n");

        BiFunction<Integer, String, String> printLineNTimes = (Integer n, String line) -> { // 3-rd
            for (int i = 0; i < n; i++) {
                return line;
            }
            return "End ";
        };
        System.out.println(printLineNTimes.apply(5, "Line printed n times."));

        Supplier<Integer> randomNumber = () -> new Random().nextInt(); // 4-th
        for (int i = 0; i < 5; i++) {
            System.out.println(randomNumber.get());
        }

        Optional<String> firstNameAndLastName = Optional.of("Mary Kulyk"); // 5-th
        firstNameAndLastName.ifPresentOrElse(print, null);
        firstNameAndLastName.get();

    }

}


