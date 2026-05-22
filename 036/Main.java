import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long tempone = in.nextLong(), temptwo = in.nextLong();
        String regime = in.next();
        if(regime.equals("heat")) {
            if(tempone >= temptwo) {
                System.out.println(tempone);
            } else {
                System.out.println(temptwo);
            }
        } else if(regime.equals("freeze")) {
            if(tempone <= temptwo) {
                System.out.println(tempone);
            } else {
                System.out.println(temptwo);
            }
        } else if(regime.equals("auto")) {
            System.out.println(temptwo);
        } else if(regime.equals("fan")) {
            System.out.println(tempone);
        }
    }
    
}
