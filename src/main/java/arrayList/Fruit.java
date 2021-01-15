package arrayList;

import java.util.ArrayList;

public class Fruit {
    
 
    public static void main(String[] args) {
        ArrayList  fruits = new ArrayList();
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Strawberry");
        fruits.add("Watermelon");
        
        fruits.toString();
        System.out.println(fruits);
        
        
        ArrayList vegetables = new ArrayList(fruits);
        vegetables.add("Tomato");
        vegetables.add("Corn");
        vegetables.add("Pumpkin");
        vegetables.add("Broccoli");
        vegetables.add("Onion");
        System.out.println(vegetables);

        System.out.println(vegetables.get(2));
        System.out.println(vegetables.contains("Onion"));
        System.out.println(vegetables.indexOf("Tomato"));
        
       }
     
     
}
