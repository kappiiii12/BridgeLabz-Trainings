// Write a program to trim the leading and trailing spaces from a string using the charAt() method 
// Hint => 
// Create a method to trim the leading and trailing spaces from a string using the charAt() method. Inside the method run a couple of loops to trim leading and trailing spaces and determine the starting and ending points with no spaces. Return the start point and end point in an array
// Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
// Write a method to compare two strings using the charAt() method and return a boolean result
// The main function calls the user-defined trim and substring methods to get the text after trimming the leading and trailing spaces. Post that use the String built-in method trim() to trim spaces and compare the two strings. And finally display the result


public class CustomTrim {
    public static void main(String[] args) {
        String input = "  Hello Java  ";
        int[] bounds = getTrimBounds(input);
        String manualTrim = customSubstring(input, bounds[0], bounds[1]);
        
        System.out.println("Manual: [" + manualTrim + "]");
        System.out.println("Match Built-in? " + compareStrings(manualTrim, input.trim()));
    }

    public static int[] getTrimBounds(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end && s.charAt(start) == ' ') start++;
        while (end >= start && s.charAt(end) == ' ') end--;
        return new int[]{start, end + 1};
    }

    public static String customSubstring(String s, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) res += s.charAt(i);
        return res;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}