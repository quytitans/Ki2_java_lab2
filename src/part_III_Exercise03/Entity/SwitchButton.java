package part_III_Exercise03.Entity;

public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;

    public SwitchButton() {
    }

    public void switchOff() {
        if (!this.status) {
            lamp.turnOff();
        }
    }
    public void switchOn(){
        if (this.status){
            lamp.turnOn();
        }
    }
    public void connectToLamp(ElectricLamp electricLamp) {
        this.lamp = electricLamp;
    }

}
