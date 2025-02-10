package example02.ru.itis.shapes;

/**
 * Lesson_06
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Point extends Shape implements Movable {
    public Point(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
