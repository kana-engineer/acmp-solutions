import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int k = scanner.nextInt();

        long total = 0; // используем long на случай больших сумм
        for (int i = 0; i < n; i++) {
            total += Math.min(a[i], k);
        }

        System.out.println(total);
    }
}