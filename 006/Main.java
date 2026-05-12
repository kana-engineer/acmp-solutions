import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        int result = a * b;
        System.out.println(result < c ? "NO": "YES");
    }
    
}
