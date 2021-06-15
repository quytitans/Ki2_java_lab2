package part_III_Exercise03;

import part_III_Exercise03.Entity.ElectricLamp;
import part_III_Exercise03.Entity.SwitchButton;

public class MainThread {
    public static void main(String[] args) {
        //Declare and initialize a SwitchButton object and an ElectricLamp object.
        ElectricLamp electricLamp = new ElectricLamp();
        SwitchButton switchButton = new SwitchButton();
        //Connect the SwitchButton object to the ElectricLamp object.
        switchButton.connectToLamp(electricLamp);
        //Turn off the SwitchButton object 10 times.
        for (int i = 0; i < 10; i++) {
            switchButton.switchOff();
        }
    }
}