import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int maxLen = 0;   // максимальная длина цепочки нулей
        int currentLen = 0; // текущая длина цепочки нулей

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                currentLen++;
            } else {
                if (currentLen > maxLen) {
                    maxLen = currentLen;
                }
                currentLen = 0;
            }
        }

        // Проверяем последнюю цепочку, если строка заканчивается нулями
        if (currentLen > maxLen) {
            maxLen = currentLen;
        }

        System.out.println(maxLen);
    }
}