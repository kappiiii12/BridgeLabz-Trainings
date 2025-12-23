import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100, and I will guess it!");
        
        playGame(sc);
        sc.close();
    }

    public static void playGame(Scanner sc) {
        int low = 1, high = 100;
        boolean guessed = false;

        while (!guessed) {
            int guess = (low + high) / 2;
            System.out.println("My guess is: " + guess);
            System.out.print("Is it high, low, or correct? ");
            String feedback = sc.next();

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("I guessed it! Great game.");
                guessed = true;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }
    }
}