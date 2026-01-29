package StreamAPIPractice;
import java.util.Arrays;
import java.util.List;

public class EmailSystem {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList(
            "arjun.v@example.com", 
            "priyanka.s@example.com", 
            "rohan.m@example.com", 
            "kavya.b@example.com"
        );

        System.out.println("--- Starting Email Dispatch ---");

        // Task: Use forEach() to trigger the notification for each user
        emails.forEach(email -> sendEmailNotification(email));
        
        System.out.println("--- All notifications queued successfully ---");
    }

    // Mock method to simulate sending an email
    public static void sendEmailNotification(String email) {
        // In a real app, this is where your SMTP or API logic would live
        System.out.println("Email sent to: " + email);
    }
}