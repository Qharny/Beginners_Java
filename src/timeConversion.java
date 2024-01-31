import java.util.Scanner;

public class timeConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter time in seconds: ");
        long totalSeconds = scanner.nextLong();  // Use long for larger values

        long years = totalSeconds / 31536000;   // Seconds in a year
        long remainingSeconds = totalSeconds % 31536000;
        long days = remainingSeconds / 86400;
        long hours = (remainingSeconds % 86400) / 3600;
        long minutes = (remainingSeconds % 3600) / 60;
        long seconds = remainingSeconds % 60;

        displayConvertedTime(totalSeconds, years, days, hours, minutes, seconds);

        scanner.close();
    }

    private static void displayConvertedTime(long totalSeconds, long years, long days, long hours, long minutes, long seconds) {
        System.out.println(totalSeconds + " seconds is equal to:");
        System.out.println(years + " year(s)");
        System.out.println(days + " day(s)");
        System.out.println(hours + " hour(s)");
        System.out.println(minutes + " minute(s)");
        System.out.println(seconds + " second(s)");
    }
}
