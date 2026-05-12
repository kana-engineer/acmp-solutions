import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int [3];
        arr[0] = in.nextInt();
        int max = arr[0];
        int min = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            arr[i] = in.nextInt();
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println((max - min));
    }
}
