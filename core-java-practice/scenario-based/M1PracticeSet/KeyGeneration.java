package RegexPractice;

import java.util.Scanner;

public class KeyGeneration {
public static boolean validate(String str) {
	String regex = "[a-zA-Z]{6,}";
	return str.matches(regex);
}
public static String process(String str) {
	str = str.toLowerCase();
	StringBuilder temp = new StringBuilder();
	
	for(int i=0;i<str.length();i++) {
		int evenASCII = (int) str.charAt(i);
		if(evenASCII %2 != 0)
			temp.append(str.charAt(i));
	}
	temp.reverse();
	StringBuilder res = new StringBuilder();
	for(int i=0;i<temp.length();i++) {
		if(i%2==0)
			res.append(Character.toUpperCase(temp.charAt(i)));
		else
			res.append(temp.charAt(i));
	}
	return "The generated key is - "+res;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    for(int i =1;i<=n;i++) {
    	String input = sc.nextLine();
    	if(!validate(input))
    		System.out.println("Invalid Output");
    	else
    		System.out.println(process(input));
    }
	}

}
