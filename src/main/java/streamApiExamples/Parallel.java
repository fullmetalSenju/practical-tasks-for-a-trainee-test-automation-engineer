package streamApiExamples;
import java.util.stream.Stream;

public class Parallel {
    public static void main(String[] args) {
        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму", "hello world");
        String sentence = wordsStream.parallel()
            .filter(s->s.length()<10) //filter of the parallel stream
            .sequential()
            .reduce("Result:", (x,y)->x + " " + y); //операция над последовательным потоком
        System.out.println(sentence);
        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6);
        Integer result = numbersStream.parallel().reduce(1, (x,y)->x * y);
        System.out.println(result); //720
    }
}
