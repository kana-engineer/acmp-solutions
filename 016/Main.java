import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int count = s / 3;
        int pet = count / 2;
        int result = count * 2;
        System.out.println(pet + " " + result + " " + pet);
    }
    
}
