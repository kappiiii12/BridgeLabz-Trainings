package FlightManagementSystem;

public class FlightSystem {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	FlightManagement<Integer> indigo = new FlightManagement<>();
    Flight<Integer> f1 = new Flight(123,"Delhi","Chennai");
    indigo.addFlight(f1);
    Flight<Integer> f2 = new Flight(124,"Jaipur","Mumbai");
    indigo.addFlight(f2);
    Flight<Integer> f3 = new Flight(125,"New York","Australia");
    indigo.addFlight(f3);
    Flight<Integer> f4 = new Flight(126,"london","Washington DC");
    indigo.addFlight(f4);
    Flight<Integer> f5 = new Flight(127,"Delhi","Kolkata");
    indigo.addFlight(f5);
    FlightBooking<Integer> booking1 = new FlightBooking(112,f1,"KAPIL");
    indigo.addBoooking(booking1);
    FlightBooking<Integer> booking2 = new FlightBooking(113,f3,"Mohan");
    indigo.addBoooking(booking2);
    FlightBooking<Integer> booking3 = new FlightBooking(114,f5,"LiLawati");
    indigo.addBoooking(booking3);
    
   indigo.displayFlights();
   indigo.displayBookings();
    
}
}
