import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        // удвоенная площадь
        long doubleArea = Math.abs(
            (long)(x2 - x1) * (y3 - y1) - (long)(x3 - x1) * (y2 - y1)
        );

        if (doubleArea % 2 == 0) {
            System.out.println(doubleArea / 2);
        } else {
            System.out.println(doubleArea / 2 + ".5");
        }
    }
}