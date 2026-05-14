import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();
        if(a + b == c || b + c == a || c + a == b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
}
