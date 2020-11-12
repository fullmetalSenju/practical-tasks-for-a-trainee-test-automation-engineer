package interfaces;

public class Boat extends Vehicle {

    @Override
    public void stopEngine() {
        System.out.println("Engine stops ");    
    }
      

    @Override
    public void beep() {
    isBeep = true;
    }
    
}
