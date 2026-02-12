//package RegexPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractProgrammingLanguageName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String regex = "JavaScript|Java|Python|Go";
	     String text ="I love Java, Python, and JavaScript, but I haven't tried Go yet.";
	     Pattern p = Pattern.compile(regex);
	     Matcher m = p.matcher(text);
	     
	     while(m.find()) {
	    	 System.out.println(m.group());
	     }
	}

}
