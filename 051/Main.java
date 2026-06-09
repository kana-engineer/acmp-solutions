import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String departure = sc.nextLine();
        int travelHours = sc.nextInt();
        int travelMinutes = sc.nextInt();

        int depHours = Integer.parseInt(departure.substring(0, 2));
        int depMinutes = Integer.parseInt(departure.substring(3, 5));

        int totalMinutes = depHours * 60 + depMinutes
                         + travelHours * 60 + travelMinutes;

        totalMinutes %= 24 * 60;

        int arrivalHours = totalMinutes / 60;
        int arrivalMinutes = totalMinutes % 60;

        System.out.printf("%02d:%02d%n", arrivalHours, arrivalMinutes);
    }
}