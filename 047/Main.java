import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String number = in.nextLine();
        if(number.contains("0")) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
