import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();

        for (int k = 0; k < m; k++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            // выводим подмассив от i до j (индексация с 1)
            for (int idx = i - 1; idx <= j - 1; idx++) {
                System.out.print(a[idx]);
                if (idx < j - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}