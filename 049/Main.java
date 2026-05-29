import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int i = 1;
        while (num >= i) {
            num -= i;
            i++;
        }
        i--;
        System.out.println(i);
    }
}
