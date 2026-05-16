
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int num1 = num / 1000;
        int num2 = num / 100;
        int nums2 = num2 % 10;
        int num3 = num / 10;
        int nums3 = num3 % 10;
        int num4 = num % 10;
        if(num1 == num4 && nums2 == nums3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    
}
