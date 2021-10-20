package be.technofuturtic.programmation_en_java.streamingAPI;

import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntermadiateMain {

    public static void main(String[] args) {

        String[] words = {"Hello", "this", "is", "an", "example", "of", "streams"};

        Predicate<String> stringPredicate = (s) -> s.contains("e");
        Stream<String> filteredStream = Stream.of(words)
                .filter(stringPredicate);
        filteredStream.forEach(System.out::println);

        System.out.println();

        Predicate<String> simplegPredicate = (s) -> s.contains("e");
        Stream<String> simpleFilterStream = Stream.of("Blade", "Gambit", "Wolverine", "Nina")
                .filter(simplegPredicate);
        simpleFilterStream.forEach(System.out::println);

        System.out.println();

        Stream<String> plusSimpleFilterStream = Stream.of("Blade", "Gambit", "Wolverine", "Nina")
                .filter((s) -> s.contains("e"));
        plusSimpleFilterStream.forEach(System.out::println);

        System.out.println();

        Stream.of("Blade", "Gambit", "Wolverine", "Nina")
                .filter((s) -> s.contains("e"))
                .forEach(System.out::println);

        System.out.println();

        // Multiple filtres
        Stream.of("Blade", "Gambit", "Wolverine", "Nina")
                .filter((s) -> s.contains("e"))
                .filter((s) -> s.length() < 6)
                .forEach(System.out::println);

        System.out.println();

        IntStream.iterate(0, i -> i + 3)
                .limit(10)
                .forEach(System.out::println);

        System.out.println();

        Stream.of(words)
                .mapToInt((s) -> s.length())
                .forEach(System.out::println);

        System.out.println();

        Stream.of(words)
                .mapToInt(String::length)
                .forEach(System.out::println);

        System.out.println();

        Stream.of(words)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println();

        Stream.of(words)
                .sorted()
                .forEach(System.out::println);

        System.out.println();

        Stream.of(8, 2, 6, 4, 3,5)
                .sorted()
                .forEach(System.out::println);
    }
}
