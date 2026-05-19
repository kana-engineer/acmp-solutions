import java.util.Scanner;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt(), b = in.nextInt();

        BiFunction<Integer, Integer, Integer> resFunction = (as, bs) -> as < bs ? (bs - as) : (12 - as) + bs;
        System.out.println(resFunction.apply(a, b));
    }
}
