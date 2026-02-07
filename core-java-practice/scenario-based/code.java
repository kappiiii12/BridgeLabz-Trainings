//package FlipKeyLogicalProblem;

import java.util.Scanner;

public class Program {
	public StringBuilder CleanseAndInvert(String input) {
		if(input.equals(null) || input.length() < 6 || !input.matches("^[a-zA-Z]+$"))
			return null;
		String temp1 = input.toLowerCase();
		StringBuilder temp2 = new StringBuilder();
		for(int i=0;i<temp1.length();i++) {
			int x = (int)temp1.charAt(i);
			if(x%2!=0)
				temp2.append(temp1.charAt(i));
		}
		temp2.reverse();
		
		StringBuilder result = new StringBuilder();
		for(int i=0;i<temp2.length();i++) {
			if(i%2==0)
				result.append(Character.toUpperCase(temp2.charAt(i)));
			else
				result.append(temp2.charAt(i));
		}
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program p = new Program();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String input = sc.next();
		System.out.print(p.CleanseAndInvert("The generated key is - "+input));
	}

}

