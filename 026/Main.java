import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] A = new int[3];
        int[] B = new int[3];

        for(int i = 0; i < A.length; i++) {
            A[i] = in.nextInt();
        }

        for(int i = 0; i < B.length; i++) {
            B[i] = in.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        int sum = 0;
        for(int i = 0; i < 3; i++) {
            sum += A[i] * B[i];
        }

        System.out.println(sum);
    }
    
}
