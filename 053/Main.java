import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();


        long kMin = (n + 5) / 6;

        long minSecond = 7 * kMin - n;
        long maxSecond = 6 * n;

        System.out.println(minSecond + " " + maxSecond);
    }
}