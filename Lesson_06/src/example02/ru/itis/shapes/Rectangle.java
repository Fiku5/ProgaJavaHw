package example02.ru.itis.shapes;

/**
 * Lesson_06
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Rectangle extends Shape implements Surface, Movable {
    private int a;
    private int b;

    public Rectangle(int x, int y, int a, int b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
