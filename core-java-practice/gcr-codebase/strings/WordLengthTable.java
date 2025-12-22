// Write a program to split the text into words and return the words along with their lengths in a 2D array
// Hint => 
// Take user input using the Scanner nextLine() method 
// Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
// Create a method to find and return a string's length without using the length() method. 
// Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
// The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display


import java.util.Scanner;

public class WordLengthTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[] words = customSplit(input);
        String[][] wordData = generateLengthArray(words);

        System.out.println("\nWord\t\tLength");
        System.out.println("-----------------------");
        for (String[] row : wordData) {
            int len = Integer.parseInt(row[1]);
            System.out.println(row[0] + "\t\t" + len);
        }
        sc.close();
    }

    // Uses length logic from previous program
    public static int getLength(String s) {
        int count = 0;
        for (char c : s.toCharArray()) count++;
        return count;
    }

    public static String[] customSplit(String s) {

        return s.split(" "); 
    }

    public static String[][] generateLengthArray(String[] words) {
        String[][] data = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(getLength(words[i]));
        }
        return data;

    }
}