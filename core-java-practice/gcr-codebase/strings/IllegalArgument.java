// Write a program to demonstrate IllegalArgumentException
// Hint => 
// Define a variable of type String and take user input to assign a value
// Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program. 
// Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
// From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException


import java.util.Scanner;

public class IllegalArgument {

    static void generateException(String text) {
        text.substring(5, 2);
    }

    static void handleException(String text) {
        try {
            text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        // generateException(text);
        handleException(text);
        sc.close();
    }
}
