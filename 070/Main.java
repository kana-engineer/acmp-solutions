import java.util.Scanner;

public class Main {
    // Проверяем, является ли символ допустимой буквой
    public static boolean isValidLetter(char c) {
        String letters = "ABCEHKMOPTXY";
        return letters.indexOf(c) != -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < N; i++) {
            String s = scanner.nextLine();

            if (s.length() != 6) {
                System.out.println("No");
                continue;
            }

            if (!isValidLetter(s.charAt(0))) {
                System.out.println("No");
                continue;
            }

            boolean digitsOK = true;
            for (int pos = 1; pos <= 3; pos++) {
                char c = s.charAt(pos);
                if (c < '0' || c > '9') {
                    digitsOK = false;
                    break;
                }
            }
            if (!digitsOK) {
                System.out.println("No");
                continue;
            }

            if (!isValidLetter(s.charAt(4)) || !isValidLetter(s.charAt(5))) {
                System.out.println("No");
                continue;
            }

            System.out.println("Yes");
        }
    }
}