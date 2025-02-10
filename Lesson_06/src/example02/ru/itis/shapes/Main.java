package example02.ru.itis.shapes;

/**
 * Lesson_06
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle(10, 5, 4);
        Rectangle r = new Rectangle(10, 5, 20, 30);
        Point p = new Point(5, 11);

        Shape[] shapes = {c, r, p};
        Surface[] surfaces = {c, r};
        Movable[] movables = {c, r, p};

        for (int i = 0; i < surfaces.length; i++) {
            System.out.println(surfaces[i].area());
            System.out.println(surfaces[i].perimeter());
        }


        // а что если я хочу считать площадь некоторых фигур?
        // а некоторые фигуры я хочу перемещать?
    }
}
