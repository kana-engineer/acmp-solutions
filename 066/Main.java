import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Y = scanner.nextInt();
        int X = scanner.nextInt();

        int result;

        if (Y % 2 == 1) { 
            result = (Y - 1) * M + (X - 1);
        } else { /
            result = (Y - 1) * M + (M - X);
        }

        System.out.println(result);
    }
}