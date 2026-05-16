import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long c = in.nextLong(), h = in.nextLong(), o = in.nextLong();
        long num = c / 2;
        long num1 = h / 6;
        long num2 = o / 1;
        if (num <= num1 && num <= num2) {
            System.out.println(num);
        } else if(num1 <= num && num1 <= num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
    }
}