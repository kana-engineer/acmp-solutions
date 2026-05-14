import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();

        if((x + y) > z) {
            System.out.println((x + y) - z);
        } else if ((x + y) == z){
            System.out.println(0);
        }
        else {
            System.out.println("Impossible");
        }
    }
    
}
