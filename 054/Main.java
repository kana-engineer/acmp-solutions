import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cell = scanner.nextLine(); 

        char letter = cell.charAt(0);
        int digit = cell.charAt(1) - '0'; 

        int letterNumber = letter - 'A' + 1;

        int sum = letterNumber + digit;

        if (sum % 2 == 0) {
            System.out.println("BLACK");
        } else {
            System.out.println("WHITE");
        }
    }
}