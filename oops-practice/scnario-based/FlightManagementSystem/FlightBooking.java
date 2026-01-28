package FlightManagementSystem;

public class FlightBooking<T> {
    private T bookingId;
    private Flight<?> flight ;
    private String passengerName;
    
    public FlightBooking(T bookingId,Flight<?> flight,String passengerName) {
    	this.bookingId = bookingId;
    	this.flight = flight;
    	this.passengerName = passengerName;
    }
     public void displayBooking() {
    	 System.out.println("------------Flight Booking-----------------");
    	 System.out.println("Booking Id : " +bookingId+" Passenger Name : "+passengerName);
    	 flight.displayFlightInfo();
    	// System.out.println("------------Flight Booking-----------------");
     }
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//        FlightBooking book = new FlightBooking("34324", new Flight("6E12334","Delhi","Chennai"),"Kapil Kumar");
//        book.displayBooking();
//	}
}
