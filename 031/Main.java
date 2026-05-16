import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char letter = in.next().charAt(0);
        String s = "qwertyuiopasdfghjklzxcvbnm";

        int index = s.indexOf(letter);

        if(index == s.length() - 1) {
            System.out.println(s.charAt(0));
        } else {
            System.out.println(s.charAt(index + 1));
        }
    }
}
