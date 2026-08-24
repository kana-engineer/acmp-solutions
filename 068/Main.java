import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < n.length(); i++) {
            char c = n.charAt(i);
            if (c == '0' || c == '6' || c == '9') {
                count += 1;
            } else if (c == '8') {
                count += 2;
            }
        }

        System.out.println(count);
    }
}