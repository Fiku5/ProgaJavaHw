package HomeWork3.app;

import HomeWork3.models.*;

public class HomeWork3 {
    public static void main(String[] args) {

        GeometricShape[] shapes = {
                new Circle(3),
                new Square(2),
                new Rectangle(3, 2),
                new Ellipse(4, 2)
        };

        for (GeometricShape shape : shapes) {
            System.out.println("Площадь: " + shape.getArea());
            System.out.println("Периметр: " + shape.getPerimeter());
            System.out.println();
        }
    }
}