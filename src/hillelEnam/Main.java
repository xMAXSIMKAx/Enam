package hillelEnam;
import java.util.Scanner;

public class Main {
    // Declaration of enum with named constants
    enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day of the week (in English):");
        String inputDay = scanner.nextLine();

        // Converting the input string to enum
        DayOfWeek day = DayOfWeek.valueOf(inputDay.toUpperCase());

        // Using switch statement with enum
        switch (day) {
            case MONDAY:
                System.out.println("It's a working day.");
                break;
            case WEDNESDAY:
                System.out.println("Half of the week is over.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend.");
                break;
            default:
                System.out.println("It's a regular working day.");
        }

        // Closing the scanner
        scanner.close();
    }
}