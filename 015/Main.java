import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n % 2 == 0) {
            System.out.println(n / 2);
        } else if(n == 1 || n == 0) {
            System.out.println(0);
        }
        else {
            System.out.println(n);
        }
    }
    
}
