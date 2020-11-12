package polymorphism;

public class Fish extends  Animal{

    public Fish(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("swim");
    }

    @Override
    public void makeSound() {
        System.out.println("no sound, only bubbles");
    }

    @Override
    public void eat() {
        System.out.println("eat worms");
    }
}
