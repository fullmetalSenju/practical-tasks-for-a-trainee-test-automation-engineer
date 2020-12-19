package interfaces;

public class Vehicle implements VehicleInterface{
    public boolean isEngineOn = false;
    public boolean isBrake = false;
    public boolean isBeep = false;
    
    @Override
    public void stopEngine() {
        isEngineOn = false;
    }

    @Override
    public void startEngine() { 
        isEngineOn = true;
    }

    @Override
    public void brake() {
        isBrake = !isBrake;

    }

    @Override
    public void beep() {
        isBeep = !isBeep;

    }

    @Override
    public void repairEngine() {
    }
}
