package streamApiExamples;

import java.util.stream.Stream;

public class Program4 {
    public static void main(String[] args){
        Stream<String> people1 = Stream.of("Tom", "Bob", "Sam");
        Stream<String> people2 = Stream.of("Alice", "Kate", "Sam");
        
        Stream.concat(people1,people2).forEach(n-> System.out.println(n));
        
        Stream<String> people = Stream.of("Tom", "Bob", "Sam", "Tom", "Alice", "Kate", "Sam");
        people.distinct().forEach(p->System.out.println(p));
        
        Stream<String> phoneStream = Stream.of("iPhone 6 S", "Lumia 950", "Samsung Galaxy S 6", "LG G 4", "Nexus 7");
        
        phoneStream.skip(1)
            .limit(2)
            .forEach(s ->System.out.println(s));
     }
}
