//package RegexPractice;

public class PlayWithRegex {
  public static void main(String[] args) {
	   String validateUserName = "^[a-zA-Z][a-zA-Z]{4,15}";
	   String str = "Kapil";
	 //  System.out.println(str.matches(validateUserName));
	   
	   
	   String licensePlate = "^[A-Z]{2}[0-9]{4}";
	   String str2 = "A1234";
	  // System.out.println(str2.matches(licensePlate));
	   
	   String hexadecimal = "[]a-zA-Z0-9]{6}";
	   String str3 = "aa9480";
	   System.out.println(str3.matches(hexadecimal));
  }
}
