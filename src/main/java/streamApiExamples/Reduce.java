package streamApiExamples;

import java.util.stream.Stream;

public class Reduce {
    public static void main(String[] args) {
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000),
            new Phone("Lumia 950", 45000),
            new Phone("Samsung Galaxy S 6", 40000),
            new Phone("LG G 4", 32000));
        int sum = phoneStream.reduce(0,(x, y)-> {
                if (y.getPrice()<50000)
                    return x + y.getPrice();
                else
                    return x + 0;},
            (x,y)->x+y);
        System.out.println(sum); //11700

    }}
