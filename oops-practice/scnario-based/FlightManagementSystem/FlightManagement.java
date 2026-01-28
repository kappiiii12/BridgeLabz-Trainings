package FlightManagementSystem;
import java.util.*;
public class FlightManagement<T> {
        private List<Flight<T>> flightList= new ArrayList<>();
        private List<FlightBooking<T>> flightBookings = new ArrayList<>();
        public void addFlight(Flight<T> flight) {
        	flightList.add(flight);
        }
        public void addBoooking(FlightBooking<T> booking) {
        	flightBookings.add(booking);
        }
        
        public void displayFlights() {
        	for(Flight<T> flight : flightList) {
        		flight.displayFlightInfo();
        	}
        }
        public void displayBookings() {
        	for(FlightBooking<T> booking : flightBookings) {
        		booking.displayBooking();
        	}
        }
        public void removeFlight(Flight<T> flight) {
        	flightList.remove(flight);
        }
        
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		FlightManagement<Integer> indigo = new FlightManagement<>();
//        Flight<Integer> f1 = new Flight(123,"Delhi","Chennai");
//        indigo.addFlight(f1);
//        Flight<Integer> f2 = new Flight(124,"Jaipur","Mumbai");
//        indigo.addFlight(f2);
//        Flight<Integer> f3 = new Flight(125,"New York","Australia");
//        indigo.addFlight(f3);
//        Flight<Integer> f4 = new Flight(126,"london","Washington DC");
//        indigo.addFlight(f4);
//        Flight<Integer> f5 = new Flight(127,"Delhi","Kolkata");
//        indigo.addFlight(f5);
//        indigo.displayFlights();
//        
//	}

}
