package polymorphism;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("fly");

    }

    @Override
    public void makeSound() {
        System.out.println("tweet tweet");

    }

    @Override
    public void eat() {
        System.out.println("eat worms");

    }
}