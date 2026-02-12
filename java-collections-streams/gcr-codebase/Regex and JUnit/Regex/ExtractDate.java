//package RegexPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//dd/mm/yyyy
      String regex = "(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}";
     String  text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";
     Pattern p = Pattern.compile(regex);
     Matcher m = p.matcher(text);
     while(m.find()) {
    	 System.out.println(m.group());
     }
	}

}
