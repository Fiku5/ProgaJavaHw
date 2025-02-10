package example02.ru.itis.shapes;

/**
 * Lesson_06
 *
 * @author Marsel Sidikov (AIT TR)
 */
public abstract class Shape {

    private int x;
    protected int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
