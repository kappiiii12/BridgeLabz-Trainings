//package RegexPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindRepeatingWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String regex = " [a-zA-z]+ ";
  String text = "This is is a repeated repeated word test.";
  Pattern pattern = Pattern.compile(regex);
  Matcher matcher = pattern.matcher(text);
  
  while(matcher.find()) {
	  if(text.indexOf(matcher.group()) != text.lastIndexOf(matcher.group()) ) {
		  System.out.println(matcher.group()); 
	  }
	  
  }
	}

}
