//package RegexPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String regex = "[a-zA-Z0-9]+@[a-zA-Z0-9.-]+\\.[a-z]{1,3}";
       String text = "Contact us at support@example.com and info@company.org";

       Pattern pattern = Pattern.compile(regex);
       Matcher matcher = pattern.matcher(text);
       
       while(matcher.find()) {
    	   System.out.println("Mail : "+matcher.group());
       }
	}

}
