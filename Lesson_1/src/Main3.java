/**
 * Lesson_1
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main3 {
    public static void main(String[] args) {
        int i = 5;
        double d; // 8 байт (вещественный)
        long l; // 8 байт (целый)
        char c; // 2 байта (символьный)

        d = i; // я могу положить целое в вещественное
        l = i; // я могу положить целое в Большее целое
        // c = i; // я не могу положить 4 байта в 2

        d = 5.5;

        // i = d; // я не могу положить 8 байт в 4
        // l = d; // я не могу положить, потому что есть нюанс :)
        d = l; // здесь могу, но тоже есть нюанс



    }
}
