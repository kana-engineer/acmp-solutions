import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        int sum1 = 0;
        int sum2 = 0;

        for(int i = 0; i < 3; i++) {
            int h1 = number % 10;
            sum1 += h1;
            number /= 10;
        }

        for(int i = 0; i < 3; i++) {
            int h1 = number % 10;
            sum2 += h1;
            number /= 10;
        }

        if(sum1 == sum2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
    
}
