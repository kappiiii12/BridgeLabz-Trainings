// Write a program to find vowels and consonants in a string and display the count of  Vowels and Consonants in the string
// Hint => 
// Create a method to check if the character is a vowel or consonant and return the result. The logic used here is as follows:
// Convert the character to lowercase if it is an uppercase letter using the ASCII values of the characters
// Check if the character is a vowel or consonant and return Vowel, Consonant, or Not a Letter
// Create a Method to Method to find vowels and consonants in a string using charAt() method and finally return the count of vowels and consonants in an array
// Finally, the main function takes user inputs, calls the user-defined methods, and displays the result. 


import java.util.Scanner;
public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int[] counts = countVowelsConsonants(input);
        System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);
    }

    public static String checkChar(char c) {
        if (c >= 65 && c <= 90) c = (char) (c + 32); // To lowercase
        if (c < 97 || c > 122) return "Not a Letter";
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
        return "Consonant";
    }

    public static int[] countVowelsConsonants(String s) {
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            String res = checkChar(s.charAt(i));
            if (res.equals("Vowel")) v++;
            else if (res.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }
}