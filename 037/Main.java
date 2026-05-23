import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long number = in.nextInt();
        long f1 = number % 10;
        number /= 10;
        long f2 = number % 10;
        number /= 10;
        long f3 = number % 10;
        number /= 10;
        long r1 = number % 10;
        number /= 10;
        long r2 = number % 10;
        number /= 10;
        long r3 = number % 10;
        if((f1 + f2 + f3) == (r1 + r2 + r3)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
