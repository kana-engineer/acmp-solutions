import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int zeros = 0;
        int ones = 0;
        for(int i = 0; i < count; i++) {
            int temp = in.nextInt();
            if(temp == 0) {
                zeros++;
            } else {
                ones++;
            }
        }

        if(zeros > ones) {
            System.out.println(ones);
        } else {
            System.out.println(zeros);
        }
    }
    
}
