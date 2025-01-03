import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class timer {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Timer:Made By Soumya <3");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter minutes: ");
        int minutes = sc.nextInt();
        System.out.print("Enter seconds: ");
        int seconds = sc.nextInt();
        int totalTimeInSeconds = (minutes * 60) + seconds;

        for (int i = totalTimeInSeconds; i >= 0; i--) {
            int remainingMinutes = i / 60;
            int remainingSeconds = i % 60;
            System.out.print("\rTime left: " + String.format("%02d:%02d", remainingMinutes, remainingSeconds));
            Thread.sleep(1000);
        }

        System.out.println("\nTime's up!");
        System.out.println("Do You Want To See More Project Like This 1-YES 2-No");
        int choice = sc.nextInt();
        if(choice == 1){
            try {
                URI link = new URI("https://github.com/biswalsoumya342");
                Desktop.getDesktop().browse(link);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else{
            System.out.println("Thank You For Using This: For More Visit-[https://github.com/biswalsoumya342]");
        }
    }
}
