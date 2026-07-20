import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int maxAge = -1;
        int answer = -1;

        for (int i = 1; i <= N; i++) {
            int age = scanner.nextInt();
            int sex = scanner.nextInt();

            if (sex == 1) { // мужчина
                if (age > maxAge) {
                    maxAge = age;
                    answer = i;
                }
                // если age == maxAge, то ничего не делаем,
                // так как i больше, а нам нужен наименьший номер
            }
        }

        System.out.println(answer);
    }
}