import java.util.Scanner;

public class CorporateEmailAccessControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String nameRegex = "[a-zA-Z]{3,}";
     String digits = "\\d{4,}";
     String  department = "(sales|marketing|IT|product)";
     String domain = "company\\.com";
      
      String regex = nameRegex+"\\."+nameRegex+digits+"@"+department+"\\."+domain;
      
      Scanner sc = new Scanner(System.in);
      
      int n = sc.nextInt();
      sc.nextLine();
      for(int i=1;i<=n;i++) {
    	  String input = sc.nextLine();
    	  if(input.matches(regex))
    		  System.out.println("Access  Granted");
    	  else
    		  System.out.println("Access Denied");
      }
      
	}

}
