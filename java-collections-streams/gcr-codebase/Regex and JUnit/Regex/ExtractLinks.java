//package RegexPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String text = "Visit https://www.google.com and http://example.org for more info.";
       String regex = "https?://[a-zA-Z0-9.!@#$%^&*?]+";
       Pattern p = Pattern.compile(regex);
       Matcher m = p.matcher(text);
       while(m.find()) {
      	 System.out.println(m.group());
       }
	}

}
