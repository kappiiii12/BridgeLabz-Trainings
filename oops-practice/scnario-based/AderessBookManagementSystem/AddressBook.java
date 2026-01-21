//package AderessBookManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
          private ArrayList<Contact> addressBookList = new ArrayList<>();
          
          public void createContact(Scanner sc) {
        	  
        	     System.out.print("Enter First Name : ");
        	     String firstName = sc.next();
        	     System.out.print("Enter Last Name : ");
        		 String lastName = sc.next();
        		 sc.nextLine();
        		 System.out.print("Enter Address : ");
        		 String address = sc.nextLine();
        		 System.out.print("Enter state : ");
        		 String state = sc.nextLine(); 
        		 System.out.print("Enter zip : ");
        		 String zip = sc.next();
        		 System.out.print("Enter Phone Number : ");
        		 String phoneNumber = sc.next();
        		 System.out.print("Enter email : ");
        		 String email = sc.next();
        		 
        		 Contact c = new Contact( firstName , lastName , address , state , zip , phoneNumber , email);
        		 addressBookList.add(c);
        		 System.out.println("Contact Created");
        		 
          }
          public void displayAdressbook() {
        	  System.out.println("------------------Adress Book Details---------------");
        	  for(Contact x : addressBookList) {
        		  x.displayContact();
        	  }
          }
          public static void main(String[] args) {
        	 AddressBook a1 = new AddressBook();
        	 Scanner sc = new Scanner(System.in);
        	 a1.createContact(sc);
//        	 a1.createContact(sc);
//        	 a1.createContact(sc);
       	 a1.displayAdressbook();
        	 sc.close();
          }
}
//package AderessBookManagementSystem;

    class Contact {
	private String firstName ;
	private String lastName;
	private String address ;
	private String state ; 
	private String zip ;
	private String phoneNumber;
	private String email ;
	
	public Contact(String firstName ,String lastName ,String address ,String state ,String zip ,String phoneNumber ,String email){
		this.firstName = firstName ;
		this.lastName = lastName ;
	    this.address = address ;
	    this.state = state ;
	    this.zip = zip;
	    this.phoneNumber = phoneNumber ;
	    this.email = email;
	}
	
	public void displayContact() {
		System.out.println("-----------------Contact Details-------------------");
		System.out.println("Name : "+firstName+ " "+lastName);
		System.out.println("Address : "+address);
		System.out.println("State : "+state);
		System.out.println("Zip : "+zip);
		System.out.println("Phone Number : "+ phoneNumber);
		System.out.println("eMail : "+email);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Contact c1 = new Contact("kapil","kumar","Surajmal Nagar","Rajasthan","321001","9549155169","kapil257141@gmail.com");
     c1.displayContact();
		
		
		
	}

}
