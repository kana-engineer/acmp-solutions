import java.util.Scanner;

public class Main {
    // Проверка, является ли билет счастливым
    public static boolean isLucky(int number) {
        // Форматируем в 6 цифр с ведущими нулями
        String s = String.format("%06d", number);
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += s.charAt(i) - '0';
            sum2 += s.charAt(i + 3) - '0';
        }
        return sum1 == sum2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.nextLine(); // переходим на следующую строку

        for (int t = 0; t < K; t++) {
            String ticketStr = scanner.nextLine();
            int ticket = Integer.parseInt(ticketStr);

            boolean prevLucky = isLucky(ticket - 1);
            boolean nextLucky = isLucky(ticket + 1);

            if (prevLucky || nextLucky) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}