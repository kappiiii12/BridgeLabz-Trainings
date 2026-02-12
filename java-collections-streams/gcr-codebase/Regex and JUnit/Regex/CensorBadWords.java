//package RegexPractice;

public class CensorBadWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String text = "This is a damn bad example with some stupid words.";
      String regex = "bad | stupid";
       text = text.replaceAll(regex," **** ");
     System.out.println(text);
	}

}
