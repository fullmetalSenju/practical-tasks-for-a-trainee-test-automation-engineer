package streamApiExamples;

import java.util.ArrayList;
import java.util.Arrays;

public class Program9 {
    public static void main (String[] args){
        ArrayList<Phone3> phones = new ArrayList<Phone3>();
        phones.addAll(Arrays.asList(new Phone3[]{
            new Phone3("iPhone 8", 52000),
            new Phone3("Nokia 9", 35000),
            new Phone3("Samsung Galaxy S9", 48000),
            new Phone3("HTC U12", 36000)
        }));

        Phone3 min2 = phones.stream().min(Phone3::compare).get();
        Phone3 max2 = phones.stream().max(Phone3::compare).get();
        System.out.printf("MIN Name: %s Price: %d \n", min2.getName(), min2.getPrice());
        System.out.printf("MAX Name: %s Price: %d \n", max2.getName(), max2.getPrice());
    }
}
class Phone3 {
    private String name;
    private int price;

    public Phone3(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public static int compare(Phone3 p1, Phone3 p2) {
        if (p1.getPrice() > p2.getPrice())
            return 1;
        return -1;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
