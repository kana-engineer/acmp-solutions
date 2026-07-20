import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        // Определяем строку и столбец (1..8)
        int row = (num - 1) / 8 + 1;
        int col = (num - 1) % 8 + 1;

        ArrayList<Integer> neighbors = new ArrayList<>();

        // Вверх
        if (row + 1 <= 8) {
            neighbors.add(row * 8 + col);
        }
        // Вниз
        if (row - 1 >= 1) {
            neighbors.add((row - 2) * 8 + col);
        }
        // Влево
        if (col - 1 >= 1) {
            neighbors.add((row - 1) * 8 + (col - 1));
        }
        // Вправо
        if (col + 1 <= 8) {
            neighbors.add((row - 1) * 8 + (col + 1));
        }

        // Сортируем по возрастанию
        Collections.sort(neighbors);

        // Выводим через пробел
        for (int i = 0; i < neighbors.size(); i++) {
            System.out.print(neighbors.get(i));
            if (i < neighbors.size() - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}