package StreamAPIPractice;
import java.util.Arrays;
import java.util.List;

public class EventWelcome {
    public static void main(String[] args) {
        // List of attendees for the Tech Conference
        List<String> attendees = Arrays.asList(
            "Amit", "Saira", "Vikram", "Neha", "Rahul"
        );

        System.out.println("--- Generating Welcome Messages ---");

        // Task: Use forEach() with a lambda to greet each attendee
        attendees.forEach(name -> {
            String message = "Welcome to the Tech Summit 2026, " + name + "!";
            System.out.println(message);
        });
    }
}