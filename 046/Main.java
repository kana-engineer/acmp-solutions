import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = in.nextInt();
        }

        int max = arr[0];
        int min = arr[0];
        for(int array : arr) {
            if(array > max) {
                max = array;
            }
            if(array < min) {
                min = array;
            }
        }
        System.out.println(min + " " + max);
    }
}
