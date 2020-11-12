package interfaces;

public class Car extends Vehicle {
    

    @Override
    public void startEngine() {
        System.out.println("Go-go, boy");
    }

    @Override
    public void beep() {
        isBeep = true;
    }

    @Override
    public void repairEngine() {
        System.out.println("Hello, can you please repair it? ");
    }
}
