import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N == 0) {
            System.out.println(0);
        } else if (N == 1) {
            System.out.println(1);
        } else {
            int prev = 0; // a0
            int curr = 1; // a1

            for (int i = 2; i <= N; i++) {
                int next = prev + curr;
                prev = curr;
                curr = next;
            }

            System.out.println(curr);
        }
    }
}