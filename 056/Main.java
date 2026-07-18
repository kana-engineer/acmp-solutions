import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        // Алгоритм Евклида
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }

        System.out.println(a);
    }
}