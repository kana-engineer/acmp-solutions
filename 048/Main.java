import java.util.Scanner;;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = in.nextInt();
        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = in.nextInt();
            arr[i] -= 1;
        }

        int sum = 0;

        for(int res : arr) {
            sum += res;
        }
        System.out.println(sum + 1);
    }
}
