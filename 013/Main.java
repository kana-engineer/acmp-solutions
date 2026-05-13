import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int team1 = 0;
        int team2 = 0;

        for(int i = 0; i < 4; i++) {
            int a = in.nextInt();
            int b = in.nextInt();

            team1 += a;
            team2 += b;
        }

        if(team1 > team2) {
            System.out.println(1);
        } else if(team1 == team2) {
            System.out.println("DRAW");
        } else {
            System.out.println(2);
        }
    }
    
}
