import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        long area = a * b;

        long c = (long) Math.sqrt(area);

        // Проверяем c, c+1, c-1 на точное совпадение
        if (c * c == area) {
            System.out.println(c);
        } else if ((c + 1) * (c + 1) == area) {
            System.out.println(c + 1);
        } else if (c > 0 && (c - 1) * (c - 1) == area) {
            System.out.println(c - 1);
        } else {
            System.out.println(0);
        }
    }
}