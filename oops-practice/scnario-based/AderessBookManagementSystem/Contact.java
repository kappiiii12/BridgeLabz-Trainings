//package AderessBookManagementSystem;

public class Contact {
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
