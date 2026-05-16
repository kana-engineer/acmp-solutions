import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int result = 0;
        for(int i = 0; i < k; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            result = 19 * b + (a + 239) * (a + 366) / 2;
            System.out.println(result);
        }
    }
    
}
