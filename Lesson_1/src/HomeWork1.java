import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[201];

        int i = scanner.nextInt();
        while (i != -1) {
            array[i + 100] += 1;
            i = scanner.nextInt();
        }

        int max = array[0];
        int number = -100;

        for (i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                number = i - 100;
            }

        }
        System.out.println(number);
    }
}