import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if(n <= 0) {
            System.out.println("NO");
            return;
        }

        while (n % 2 == 0) {
            n /= 2;
        }

        if(n == 1) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
    
}
