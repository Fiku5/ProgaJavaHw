package example02.ru.itis.shapes;

/**
 * Lesson_06
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Circle extends Shape implements Surface, Movable {

    private double radius;


    public Circle(double radius, int x, int y) {
        super(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
