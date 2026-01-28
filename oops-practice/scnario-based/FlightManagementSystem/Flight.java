package FlightManagementSystem;

public class Flight<T> {
     private T flightNumber ;
     private String departure;
     private String destination ;
     
     public Flight( T flightNumber,String departure, String destination ) {
    	 this.flightNumber = flightNumber;
    	 this.departure = departure ;
    	 this.destination = destination;
    	 
     }
     public T getFlightNumber() {
    	 return this.flightNumber;
     }
	public void displayFlightInfo() {
		 System.out.println("------------Flight Information-----------------");
		System.out.println("Flight Number : "+flightNumber);
		System.out.println("Flight Departure : "+departure);
		System.out.println("Flight Destination : "+destination);
		// System.out.println("------------Flight Information-----------------");
	}
//	 public static void main(String[] args) {
//		 Flight f1 = new Flight(234,"Delhi","chennai");
//		 Flight f2 = new Flight("65E124","Delhi","chennai");
//		 
//		 f1.displayFlightInfo();
//		 f2.displayFlightInfo();
//	 }
}
