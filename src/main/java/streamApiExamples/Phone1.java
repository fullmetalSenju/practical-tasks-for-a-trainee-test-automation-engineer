package streamApiExamples;
import java.util.Comparator;

import java.util.stream.Stream;

public class Phone1 {
    private String name;
    private String company;
    private int price;

    public Phone1(String name, String company, int price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getPrice() {
        return price;
    }
    
}
