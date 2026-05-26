import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(n % 400 == 0 || (n % 4 == 0 && n % 100 != 0)) {
            days[1] = 29;
        }

        int day = 255;
        int month = 0;

        while (day >= days[month]) {
            day -= days[month];
            month++;
        }

        int den = day + 1;

        System.out.printf("%02d/%02d/%d\n", den, month + 1, n);
    }
    
}
