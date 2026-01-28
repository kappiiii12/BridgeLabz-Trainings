//package CodingProblems;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class LexicalTwist {
     public static boolean checkBoth(String first,String second) {
    	 if(first.length() != second.length())
    		 return false;
         return first.equalsIgnoreCase(reverseString(second));
    	}
     public static String reverseString(String string) {
    	 StringBuilder s = new StringBuilder(string);
     	s.reverse() ;
     	String reversed = s.toString();
     	return reversed;
     }
     public static String firstOperation(String first) {
    	 String firstreversed = reverseString(first);
    	 char[] res = firstreversed.toCharArray();
    	 for(int i = 0;i<res.length;i++) {
    		 if ("aeiouAEIOU".indexOf(res[i]) != -1) {
    	            res[i] = '@';
    	        }
    	 }
    	 return new String(res).toLowerCase();
  }
     public static int countVowels(String s) {
    	 int count=0;
    	 for(int i=0;i<s.length();i++) {
    		 if("aeiouAEIOU".indexOf(s.charAt(i)) != -1) {
    			 count++;
    		 }
    		
    	 }
    	 return count;
     }
     public static String secondOperation(String first,String second) {
    	 String ans = "";
    	 String res = first+second;
    	 res = res.toUpperCase();
    	 int vowels = countVowels(res);
    	 int consonants = res.length()-vowels;
    	 
    	 if(vowels > consonants) {
    		 
    		 Set<Character> set = res.chars() 
    		            .mapToObj(c -> (char) c)  
    		            .collect(Collectors.toCollection(LinkedHashSet::new));
    		 //System.out.println(set);
    		 int count = 0;
    		 for(Character c : set) {
    			 if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
    				count++;
    				ans += c;
    			 }
    			 if(count==2)
    				 return ans;
    		 }
    		 return ans;
    	 }
    	 else if(vowels < consonants) {
    		 Set<Character> set = res.chars() 
 		            .mapToObj(c -> (char) c)  
 		           .collect(Collectors.toCollection(LinkedHashSet::new));
 		// System.out.println(set);
 		 int count = 0;
 		 for(Character c : set) {
 			 if(c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
 				count++;
 				ans += c;
 			 }
 			 if(count==2)
 				 return ans;
 		 }
 		 return ans;
    	 }
    	 else
    		 return "Vowels and consonants are equal";
       }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Word : ");
        String first = sc.nextLine();
        if (first.trim().contains(" ")) {
            System.out.println(first + " is an invalid word");
            return;
        }
        System.out.println("Enter the Second Word : ");
        String second = sc.nextLine();
        if(checkBoth(first,second)) {
        	System.out.println(firstOperation(first));
        	}
        else {
    		System.out.println(secondOperation(first,second));
    	}
        }

        
	}


