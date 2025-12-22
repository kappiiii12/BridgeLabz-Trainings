// Write a program to find and return the length of a string without using the length() method 
// Hint => 
// Take user input using the Scanner next() method 
// Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
// The main function calls the user-defined method as well as the built-in length() method and displays the result

import java.util.Scanner;

public class lengthOfString {
    public static int LengthString(String s){
        int size=0;
       while(true){
         try{
              s.charAt(size);
              size++;
        }
        catch(RuntimeException e){
           break;
        }
       }
       return size;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String text = sc.next();
        int userLength = LengthString(text);
        int builtInLength = text.length();

        System.out.println("Length using user-defined method: " + userLength);
        System.out.println("Length using built-in length(): " + builtInLength);
        sc.close();
    }
}
