import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();
        
        // Call the method to convert days
        convertDays(days);
    }

    public static String convertDays(int days) {
        // Convert days into years, months, and days
        int years = days / 365;
        int remainingDays = days % 365;
        int months = remainingDays / 30;
        remainingDays = remainingDays % 30;

        // Print the result
	System.out.print(days + " days is approximately " + years + " years, " + months + " months, and " + remainingDays + " days.");
        return days + " days is approximately " + years + " years, " + months + " months, and " + remainingDays + " days.";
	
    }
}