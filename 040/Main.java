import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int r = num % 3;
        if(r == 0) {
            System.out.println("GCV");
        } else if(r == 1) {
            System.out.println("VGC");
        } else {
            System.out.println("CVG");
        }
    }
    
}
