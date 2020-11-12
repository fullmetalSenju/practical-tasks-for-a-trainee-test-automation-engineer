package oop;

public class Cat {
    String name = "unknown";
    int age = 1;
    String behavior = "unknown";
    
    Cat (){
    }
    
    Cat(int age, String behavior){
        this.age = age;
        this.behavior = behavior;
    }
    
    
    Cat(String name, int age, String behavior){
        this.name = name;
        this.age = age;
        this.behavior = behavior;
    }
     
    void makeMeow (){
        System.out.println("MEOW");
    }
    
    
}
