package part_III_Exercise02;

import part_III_Exercise02.Entity.Rectangle;

public class MainThread {
    public static void main(String[] args) {
        //Initializing Temperature object.
        Rectangle rectangle = new Rectangle();
        //Assign values of C temperature to the object at a temperature of 25 degrees.
        rectangle.setcTemp(25);
        //Display to screen F and Kelvin temperature, respectively.
        System.out.printf("Temperature is %f oC",rectangle.getcTemp());
        System.out.printf("\nTemperature is %f oF",rectangle.getFTemp());
        System.out.printf("\nTemperature is %f oK",rectangle.getKTemp());
    }
}
