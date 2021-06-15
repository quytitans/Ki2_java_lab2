package lab2_exercise2.entity;

public class FlashLamp {
    private boolean status;
    private Battery battery;

    public FlashLamp() {
        status = false;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void light() {
        if (status == true && battery != null && battery.getEnergy() > 0) {
            battery.decreaseEnergy();
        }
    }

    public void turnOn() {
        if (battery != null && battery.getEnergy() > 0) {
            status = true;
        }
    }

    public void turnOff() {
        status = false;
    }
}
