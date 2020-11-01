package oop;

public class Dog {
    String name = "Doggo";
    int age = 2;
    String behavior = "unknown";
        
    public Dog() {
    }
    
    Dog(String name, int age ){
        this.name = name;
        this.age = age;
        
    }
    
    Dog(String name, int age, String behavior){
        this.name = name;
        this.age = age;
        this.behavior = behavior;
    }
     String getName(){
       return name; 
    }
    int getAge(){
        return age;
    }
    
    String getBehavior(){
        return behavior;
    }
    
    String makeWoof(){
        return "WOOF";
    }
}
