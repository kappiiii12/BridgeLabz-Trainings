import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.nextLine();

        try {
            LocalDate date = LocalDate.parse(input);
            System.out.println("Original Date: " + date);

            // Add 7 days, 1 month, and 2 years
            LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2);
            System.out.println("After additions: " + result);

            // Subtract 3 weeks
            result = result.minusWeeks(3);
            System.out.println("Final Date (after subtracting 3 weeks): " + result);

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        } finally {
            sc.close();
        }
    }
}