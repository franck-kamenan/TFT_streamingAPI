package be.technofuturtic.programmation_en_java.streamingAPI;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainCS {

    public static void main(String[] args) {

        String[] words = {"Hello", "this", "is", "an", "example", "of", "streams"};
        for (String w: words) {

            System.out.println(w);
        }

        System.out.println();

        Stream.of(words).forEach(System.out::println);

        System.out.println();

        Stream<String> monStream = Stream.of(words);
        monStream.forEach(System.out::println);

        System.out.println();

        // infinite print
        Stream<String> monAutreStream = Stream.generate(() -> "Hello World");
//        monAutreStream.forEach(System.out::println);

        IntStream monInt = IntStream.rangeClosed(0, 10);
        monInt.forEach(System.out::println);

        System.out.println();

        IntStream.rangeClosed(0, 10)
                .forEach(System.out::println);

        // infinite print
//        IntStream.iterate(0,i -> i + 1)
//                .forEach(System.out::println);

        System.out.println();

        Stream<String> streamConsumer = Stream.of(words);
        Consumer<String> coco = s -> System.out.println(s);
        streamConsumer.forEach(coco);

        System.out.println();

        Stream<String> streamCaca = Stream.of(words);
        Consumer<String> caca = System.out::println;
        streamCaca.forEach(caca);

        System.out.println();

        Stream.of(words)
                .forEach(System.out::println);

        System.out.println();

        int sumIntStream = IntStream.rangeClosed(0, 10)
                .sum();

        System.out.println(sumIntStream);

        System.out.println();

        OptionalInt max = IntStream.rangeClosed(0, 10)
                .max();
        if (max.isPresent()) {

            System.out.println(max.getAsInt());
        } else {

            System.out.println("No result.");
        }

        System.out.println();

        OptionalInt maxVide = IntStream.of()
                .max();
        if (maxVide.isPresent()) {

            System.out.println(maxVide.getAsInt());
        } else {

            System.out.println("No result.");
        }
        System.out.println();

        int resultIntStream = IntStream.rangeClosed(1, 10)
                .reduce(1,(acc, el) -> acc + el);
        System.out.println(resultIntStream);

        System.out.println();

        String resultStream = Stream.of(words)
                .reduce("*", (acc, el) -> acc + el + " espace ");
        System.out.println(resultStream);

        System.out.println();

        String[] saStream = Stream.of(words)
                .toArray(size -> new String[size]);
        System.out.println(Arrays.toString(saStream));

        System.out.println();

        String[] constructionStream = Stream.of(words)
                .toArray(String[]::new);
        System.out.println(Arrays.toString(constructionStream));

        System.out.println();

        int[] numbersIntStream = IntStream.of(5, 8, 9, 4, 6)
                .toArray();
        System.out.println(Arrays.toString(numbersIntStream));

        System.out.println();
    }
}
