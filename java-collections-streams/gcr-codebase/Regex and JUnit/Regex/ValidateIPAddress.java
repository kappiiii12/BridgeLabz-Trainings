//package RegexPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateIPAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "Server IP is 192.168.1.1 and gateway is 10.0.0.255";
		String octate = "(\\d{1,2}|[0-1]\\d{2}|2[0-4][0-9]|25[0-5])";
           String regex = octate+"\\."+octate+"\\."+octate+"\\."+octate;
           Pattern p = Pattern.compile(regex);
           Matcher m = p.matcher(text);
           while(m.find()) {
          	 System.out.println(m.group());
           }
	}

}
