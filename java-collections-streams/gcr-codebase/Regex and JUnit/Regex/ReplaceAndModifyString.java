//package RegexPractice;

public class ReplaceAndModifyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String text = "This  is     an example   with multiple   spaces.";
     String regex = "[ ]+";
     text = text.replaceAll(regex," ");
     System.out.println(text);
	}

}
