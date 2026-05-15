import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int timeOfYear = in.nextInt();
        switch (timeOfYear) {
            case 4:
            case 5:
            case 3:
                System.out.println("Spring");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
        
            default:
                System.out.println("Error");
                break;
        }
    }
    
}
