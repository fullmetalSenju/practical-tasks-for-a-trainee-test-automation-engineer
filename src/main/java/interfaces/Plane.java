package interfaces;

public class Plane extends Vehicle {

    @Override
    public void stopEngine() {
        isEngineOn = false;
    }

    @Override
    public void startEngine() {
        isEngineOn = false;
    }

    @Override
    public void brake() {
        isBrake = true;
    }

    @Override
    public void beep() { 
        isBeep = true;
    }

    @Override
    public void repairEngine() {
        System.out.println("Please repair ");

    }
}
