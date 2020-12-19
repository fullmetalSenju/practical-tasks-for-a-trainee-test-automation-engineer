package polymorphism;

public class Predatory extends Mammal {
    public Predatory(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("run fast");
    }

    @Override
    public void makeSound() {
        System.out.println("roar");
    }

    @Override
    public void eat() {
        System.out.println("mostly meat");
    }

    @Override
    public void hunt() {
        System.out.println("other animals");
    }

    @Override
    public void sleep() {
        System.out.println("sleep long");

    }


}