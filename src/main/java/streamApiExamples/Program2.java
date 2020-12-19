package streamApiExamples;

import java.util.Comparator;
import java.util.stream.Stream;

public class Program2 {
    public static void main (String[]args){
        Stream<Phone1> phone1Stream = Stream.of(new Phone1("iPhone X", "Apple", 600),
            new Phone1("Pixel 2", "Google", 500),
            new Phone1("iPhone 8", "Apple",450),
            new Phone1("Nokia 9", "HMD Global",150),
            new Phone1("Galaxy S9", "Samsung", 300));

        phone1Stream.sorted(new PhoneComparator())
            .forEach(p->System.out.printf("%s (%s) - %d \n",
                p.getName(), p.getCompany(), p.getPrice()));

    }
}


class PhoneComparator implements Comparator<Phone1> {
    public int compare(Phone1 a, Phone1 b){
        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());

    }

}

