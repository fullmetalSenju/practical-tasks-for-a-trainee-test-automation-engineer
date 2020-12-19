package streamApiExamples;

import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program12 {
    public static void main(String[] args) {
        Stream<Phone> phoneStream4 = Stream.of(new Phone("iPhone 8", 54000),
            new Phone("Nokia 9", 45000),
            new Phone("Samsung Galaxy S9", 40000),
            new Phone("LG G6", 32000));

        Map<String, Integer> phones = phoneStream4
            .collect(Collectors.toMap(p ->p.getName(), t-> t.getPrice()));
        phones.forEach((k,v)-> System.out.println(k+ " " + v));
    }
}
class Phone6{

    private String name;
    private int price;

    public Phone6(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
}