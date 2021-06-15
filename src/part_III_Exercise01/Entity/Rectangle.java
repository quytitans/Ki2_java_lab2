package part_III_Exercise01.Entity;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void display(){
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < width; j++) {
                if (j!=width-1){
                    System.out.printf("# ");
                }else {
                    System.out.printf("# \n");
                }
            }
        }
    }
    public int getArea(){
       int s = this.height * this.width;
       return s;
    }
    public int getPerimeter(){
        return (2*(this.height+this.width));
    }
}
