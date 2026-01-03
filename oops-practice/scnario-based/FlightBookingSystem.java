import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlightBookingSystem {
    // Fixed array for available flights
    static String[] flights = {"New York", "London", "Tokyo", "Paris", "Dubai"};
    // List to store user bookings dynamically
    static List<String> userBookings = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Search  2. Book  3. View My Bookings  4. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter destination: ");
                searchFlight(sc.nextLine());
            } else if (choice == 2) {
                System.out.print("Enter destination to book: ");
                bookFlight(sc.nextLine());
            } else if (choice == 3) {
                displayBookings();
            } else break;
        }
    }

    public static void searchFlight(String destination) {
        boolean found = false;
        for (String f : flights) {
            // Case-insensitive search
            if (f.equalsIgnoreCase(destination)) {
                System.out.println("Flight to " + f + " is available!");
                found = true;
            }
        }
        if (!found) System.out.println("No flights found to " + destination);
    }

    public static void bookFlight(String destination) {
        for (String f : flights) {
            if (f.equalsIgnoreCase(destination)) {
                userBookings.add(f);
                System.out.println("Booking successful!");
                return;
            }
        }
        System.out.println("Cannot book: Flight not found.");
    }

    public static void displayBookings() {
        System.out.println("Your Bookings: " + (userBookings.isEmpty() ? "None" : userBookings));
    }
}