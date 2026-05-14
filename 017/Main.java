import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int thick1 = in.nextInt();
        int thick2 = in.nextInt();
        int thick3 = in.nextInt();

        if ((thick1 >= 94 && thick1 <= 727) &&
            (thick2 >= 94 && thick2 <= 727) &&
            (thick3 >= 94 && thick3 <= 727)) {

            if (thick1 >= thick2 && thick1 >= thick3) {
                System.out.println(thick1);
            } else if (thick2 >= thick1 && thick2 >= thick3) {
                System.out.println(thick2);
            } else {
                System.out.println(thick3);            
            }

        } else {
            System.out.println("Error");
        }
    }
}