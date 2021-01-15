package arrayList;

import java.util.ArrayList;

public class Cat { 
    
    private String name;

    public Cat(String name) {
        this.name = name;
    }
    
    public static void main(String[] args) {

        ArrayList<Cat> cats = new ArrayList<>();
        Cat borya = new Cat("Borya");
        Cat masha = new Cat("Masha");
        Cat gosha = new Cat("Gosha");
        Cat nelson = new Cat("Nelson");
        
        cats.add(borya);
        cats.add(masha);
        cats.add(gosha);
        cats.add(nelson);
        
        int boryaIndex = cats.indexOf(borya);
        System.out.println(boryaIndex);
        
        System.out.println(cats.contains(gosha));
        cats.remove(gosha);
        System.out.println(cats.contains(gosha));
        
        
        ArrayList<Cat> cats1 = new ArrayList<>(cats);
        Cat kesha = new Cat("Kesha");
        Cat murko = new Cat("Murko");
        Cat zendaya = new Cat("Zendaya");
        Cat hola = new Cat("Hola");
        Cat qwerty = new Cat("Qwerty");
        Cat pushok = new Cat("Pushok");
        
        cats1.add(murko);
        cats1.add(kesha);
        cats1.add(zendaya);
        cats1.add(hola);
        cats1.add(qwerty);
        
        System.out.println(cats1.toString());
        cats1.set(2, pushok);
        System.out.println(cats1.toString());
        
        cats1.add(4, qwerty);
        System.out.println(cats1.toString());
        
    }
    @Override
    public String toString() {
        return "Cat{" +
            "name='" + name + '\'' +
            '}';
    }
}
