package part_III_Exercise03.Entity;

public class ElectricLamp {
    private boolean status;

    public ElectricLamp() {
    }

    public void turnOff() {
        this.status = false;
    }

    public void turnOn() {
        this.status = true;
    }
}
