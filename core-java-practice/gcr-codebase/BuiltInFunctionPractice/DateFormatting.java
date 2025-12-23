import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        // Define custom patterns
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Current Date in different formats:");
        System.out.println("Format 1 (dd/MM/yyyy): " + now.format(fmt1));
        System.out.println("Format 2 (yyyy-MM-dd): " + now.format(fmt2));
        System.out.println("Format 3 (EEE, MMM dd, yyyy): " + now.format(fmt3));
    }
}