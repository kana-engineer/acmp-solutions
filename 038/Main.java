import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), t = in.nextInt();

        if(a >= t) {
            System.out.println(t * b);
        }
        else {
            System.out.println(a * b + (t - a) * c);
        }
    }
}
