package streamApiExamples;

import java.util.stream.Stream;

public class Program3 {
    public static void  main (String[] args){
        Stream<Integer> numbers = Stream.of(-3, -2, -5, -4, -1, -1, 0, 1, 2, 3, -4, -5, -4, -1);
        numbers.takeWhile(n->n < 0)
            .forEach(n-> System.out.println(n));
        System.out.println();
        
    Stream<Integer> numbers1 = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
    numbers1.sorted().takeWhile(n-> n < 0)
        .forEach(n-> System.out.println(n));
        System.out.println();


        Stream<Integer> numbers3 = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
    numbers3.sorted().dropWhile(n-> n < 0)
        .forEach(n-> System.out.println(n));
        System.out.println();

    }}
