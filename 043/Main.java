import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        String text = in.next();

        int index = num - 1;


        String left = text.substring(0, index);
        String right = text.substring(index + 1);
        System.out.println(left + right);

    }
}
