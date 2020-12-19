package streamApiExamples;

import java.util.stream.Stream;

public class Phone {
    private String name;
    private int price;
    
    public Phone(String name, int price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
     
  
}
