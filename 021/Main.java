import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt(), c = in.nextInt();

        int res = c * 2;
        if(res <= a && res <= b) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
}
