package streamApiExamples;

import java.util.Optional;
import java.util.stream.Stream;

public class Program10 {
    public static void main(String[] args) {
        Stream<Integer> numbersStream = Stream.of(1,2,3,4,4,5,6);
        Optional<Integer> result= numbersStream.reduce((x,y)->x*y);
        System.out.println(result.get()); //2880

        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
        Optional<String>sentence = wordsStream.reduce((x,y) -> " " + y);
        System.out.println(sentence.get());
        
        Stream<Integer> numberStream = Stream.of(-4,3,-2,1);
        int identity = 1;
        int result3 = numbersStream.reduce(identity,(x,y)->x*y);
        System.out.println(result3);

    }
}
