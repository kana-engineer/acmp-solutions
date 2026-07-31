import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();

        // ceil(a/2) = (a + 1) / 2
        long minHerons = Math.max((a + 1) / 2, (b + 1) / 2);
        long maxHerons = Math.min(a, b);

        System.out.println(minHerons + " " + maxHerons);
    }
}