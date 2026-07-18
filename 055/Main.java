import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moves = scanner.nextLine();

        int pos = 0; 

        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);

            if (move == 'A') {
               
                if (pos == 0) {
                    pos = 1;
                } else if (pos == 1) {
                    pos = 0;
                }
               
            } else if (move == 'B') {
             
                if (pos == 1) {
                    pos = 2;
                } else if (pos == 2) {
                    pos = 1;
                }
            } else if (move == 'C') {
             
                if (pos == 0) {
                    pos = 2;
                } else if (pos == 2) {
                    pos = 0;
                }
            }
        }

        System.out.println(pos + 1);
    }
}