import java.util.Scanner;

public class timer {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();
        int totalTimeInSeconds = (minutes * 60) + seconds;

        for (int i = totalTimeInSeconds; i >= 0; i--) {
            int remainingMinutes = i / 60;
            int remainingSeconds = i % 60;
            System.out.print("\rTime left: " + String.format("%02d:%02d", remainingMinutes, remainingSeconds));
            Thread.sleep(1000);
        }

        System.out.println("\nTime's up!");
    }
}
