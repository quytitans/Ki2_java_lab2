package part_III_Exercise01;

import part_III_Exercise01.Entity.Rectangle;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Hay nhập chiều dài hình chữ nhật: ");
//        int width = scanner.nextInt();
//        System.out.println("Hay nhập chiều rộng hình chữ nhật: ");
//        int height = scanner.nextInt();
        // Declare and initialize an object of type Rectangle.
        Rectangle rectangle = new Rectangle(7,3);
        System.out.println("this is our rectangle: ");
        //Show the rectangle on the screen console.
        rectangle.display();
        //Change the length and width of the rectangle.
        rectangle.setHeight(6);
        rectangle.setWidth(14);
        rectangle.display();
        //Display to screen area and perimeter of this rectangle.
        System.out.printf("Area: %d m2",rectangle.getArea());
        System.out.printf("\nPerimeter: %d m",rectangle.getPerimeter());
    }
}
