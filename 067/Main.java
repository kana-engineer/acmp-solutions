import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double S = scanner.nextDouble();
        double R1 = scanner.nextDouble();

        double R2 = Math.sqrt(R1 * R1 - S / Math.PI);

        System.out.printf("%.3f", R2);
    }
}