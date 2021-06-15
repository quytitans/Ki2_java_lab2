package part_III_Exercise02.Entity;

public class Rectangle {
    private double cTemp;

    public Rectangle() {
    }

    public Rectangle(double cTemp) {
        this.cTemp = cTemp;
    }

    public double getcTemp() {
        return cTemp;
    }

    public void setcTemp(double cTemp) {
        this.cTemp = cTemp;
    }

    public double getFTemp() {
        return (this.cTemp * 33.8);
    }
    public double getKTemp() {
        return (this.cTemp + 273.15);
    }
}
