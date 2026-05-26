import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int temp = in.nextInt();
        Boolean flag = true;
        int count = 0;
        for(int i = 0; i < temp; i++) {
            int bridge = in.nextInt();
            if(bridge <= 437) {
                flag = false;
                count =  i + 1;
                break;
            }
        }

        if(!flag) {
            System.out.println("Crash " + count);
        } else {
            System.out.println("No crash");
        }
    }
}
