//package RegexPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractAllCapitalizedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String regex = "[A-Z][a-zA-z]*";
     String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";
     Pattern p = Pattern.compile(regex);
     Matcher m = p.matcher(text);
     
     while(m.find()) {
    	 System.out.println(m.group());
     }
	}

}
