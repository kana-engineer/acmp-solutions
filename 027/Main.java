import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();

        long area = 2 * (a * b + a * c + b * c);
        long volume = a * b * c;

        System.out.println(area + " " + volume);
    }
}