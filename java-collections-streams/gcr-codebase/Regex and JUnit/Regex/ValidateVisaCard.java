//package RegexPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateVisaCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String regex = "4\\d{15}";
String text = "My Visa card number is 4123456789012345 and another is 4999888877776666";
Pattern p = Pattern.compile(regex);
Matcher m = p.matcher(text);
while(m.find()) {
	 System.out.println(m.group());
}
	}

}
