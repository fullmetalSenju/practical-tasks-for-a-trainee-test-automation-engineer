package streamApiExamples;

import java.util.stream.Stream;

public class Main {
    public static void main (String[]args){
        Stream<Phone3> phoneStream = Stream.of(new Phone3("iPhone 6 s", 54000), new Phone3("Lumia 960", 45000),
            new Phone3("Samsung Galaxy s5", 40000));
        phoneStream.filter(p-> p.getPrice()<50000).forEach(p -> System.out.println(p.getName()));
        
        Stream<Phone3> phoneStream2 = Stream.of(new Phone3("iPhone 6 S", 54000), new Phone3("Lumia 950", 45000),
            new Phone3("Samsung Galaxy S 6", 40000));
        
        phoneStream2
            .map(p -> p.getName()) //помещаю  в поток только наззвания телефонов
            .forEach(s->System.out.println(s));
        
        phoneStream2
            .map(p -> "name: " + p.getName() + "price" + p.getPrice())
            .forEach(s-> System.out.println(s));
        
        Stream<Phone3> phoneSteam3 = Stream.of(new Phone3("iPhone 6 S", 54000), new Phone3("Lumia 950", 45000),
            new Phone3("Samsung Galaxy S 6", 40000));
        phoneSteam3
            .flatMap(p-> Stream.of(
                String.format("name: %s price without discount: %d", p.getName(), p.getPrice()),
                String.format("name: %s price with discount: %d", p.getName(), p.getPrice() - (int) (p.getPrice()*0.1))
            ))
            .forEach(s -> System.out.println(s));
    }
}
