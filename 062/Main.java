import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        // Используем StringBuilder для удобного построения строк
        StringBuilder triples = new StringBuilder();
        StringBuilder fours = new StringBuilder();

        int countTriples = 0;
        int countFours = 0;

        for (int i = 0; i < n; i++) {
            int day = scanner.nextInt();

            if (day % 2 == 1) { // нечетный -> тройка
                if (countTriples > 0) {
                    triples.append(" ");
                }
                triples.append(day);
                countTriples++;
            } else { // четный -> четверка
                if (countFours > 0) {
                    fours.append(" ");
                }
                fours.append(day);
                countFours++;
            }
        }

        // Выводим строки
        System.out.println(triples.toString());
        System.out.println(fours.toString());

        if (countFours >= countTriples) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}