package polymorphism;

public class Primate extends Mammal {
    public Primate(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("slow and careful");
    }

    @Override
    public void makeSound() {
        System.out.println("gaahr");
    }

    @Override
    public void eat() {
        System.out.println("leaves");
    }

    @Override
    public void hunt() {
        System.out.println("no hunting");
    }

    @Override
    public void sleep() {
        System.out.println("long");
    }

}