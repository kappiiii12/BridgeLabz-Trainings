// Write a program to split the text into words, compare the result with the split() method and display the result 
// Hint => 
// Take user input using the Scanner nextLine() method 
// Create a Method to find the length of the String without using the built-in length() method. 
// Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
// Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
// Then Create an array to store the words and use the indexes to extract the words
// Create a method to compare the two String arrays and return a boolean
// The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result


import java.util.Scanner;

public class CustomSplitComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        String[] manual = customSplit(input);
        String[] builtIn = input.split(" ");

        boolean isEqual = compareArrays(manual, builtIn);

        System.out.println("Manual Split Result: " + java.util.Arrays.toString(manual));
        System.out.println("Built-in Split Result: " + java.util.Arrays.toString(builtIn));
        System.out.println("Are results identical? " + isEqual);
        sc.close();
    }

    public static int getLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] customSplit(String s) {
        int length = getLength(s);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') wordCount++;
        }

        int[] spaceIndexes = new int[wordCount + 1];
        spaceIndexes[0] = -1;
        int idx = 1;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ' ') spaceIndexes[idx++] = i;
        }
        spaceIndexes[wordCount] = length;

        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word += s.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
}