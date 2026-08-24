import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int i = scanner.nextInt();
        int j = scanner.nextInt();

        int diff = Math.abs(i - j);

        int way1 = diff - 1;
        int way2 = N - diff - 1;

        int answer = Math.min(way1, way2);

        System.out.println(answer);
    }
}