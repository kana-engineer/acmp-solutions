import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int l = in.nextInt(), w = in.nextInt(), h = in.nextInt();

        int width = (l * h) + (l * h);
        int height = (w * h) + (w * h);
        int area = width + height;
        System.out.println((area + 15) / 16);
    }
    
}
