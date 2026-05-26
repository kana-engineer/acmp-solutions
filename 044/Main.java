import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt(), n = in.nextInt();

        int page = (n - 1) / k + 1;
        int line = (n - 1) % k + 1;

        System.out.println(page + " " + line);
    }
}
