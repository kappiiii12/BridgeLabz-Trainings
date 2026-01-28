import java.util.Scanner;
class FlightUtility {
   public boolean validateFlightName(String flightName) throws InvalidFlightException {
	   if(flightName.equalsIgnoreCase("SpiceJet") || flightName.equalsIgnoreCase("Vistara") || flightName.equalsIgnoreCase("Indigo")|| flightName.equalsIgnoreCase("Air Arabia")) 
		   return true;
	   else 
		   throw new InvalidFlightException("NO FLIGHT FOUND WITH NAME : "+flightName);
   }
   public boolean validateFlightNumber(String flightNumber) throws InvalidFlightException {
	   String regex = "^FL-[1-9][0-9]{3}$";

	    if (flightNumber != null && flightNumber.matches(regex)) {
	        return true;
	    } else {
	        throw new InvalidFlightException("The flight number " + flightNumber + " is invalid");
	    }
   }
   public boolean validatePassengerCount(int passengerCount, String flightName) throws InvalidFlightException {
	   if(flightName.equalsIgnoreCase("Air Arabia")) {
   		if(passengerCount >=0 && passengerCount <= 130) 
   			return true;
   		else
   			throw new InvalidFlightException("Invailid Passenger Capacity for "+flightName);
   	}
   	else if(flightName.equalsIgnoreCase("Indigo")) {
   		if(passengerCount >=0 && passengerCount <= 230) 
   			return true;
   		else
   			throw new InvalidFlightException("Invailid  Passenger Capacity for "+flightName);
   	}
   	else if(flightName.equalsIgnoreCase("Vistara")) {
   		if(passengerCount >=0 && passengerCount <= 615) 
   			return true ;
   		else
   			throw new InvalidFlightException("Invailid  Passenger Capacity for "+flightName);
   	}
   	else if(flightName.equalsIgnoreCase("SpiceJet")) {
   		if(passengerCount>=0 && passengerCount <= 396) 
   			return true ;
   		else
   			throw new InvalidFlightException("Invailid  Passenger Capacity for "+flightName);
   	}
   	else {
   		throw new InvalidFlightException("No Flight found with name : "+flightName);
	    
   	}
   }
    public double calculateFuelToFillTank(String flightName, double currentFuelLevel) throws InvalidFlightException {
    	if(flightName.equalsIgnoreCase("Air Arabia")) {
    		if(currentFuelLevel >=0 && currentFuelLevel <= 150000) 
    			return 300000-currentFuelLevel;
    		else
    			throw new InvalidFlightException("Invailid fuel Level for "+flightName);
    	}
    	else if(flightName.equalsIgnoreCase("Indigo")) {
    		if(currentFuelLevel >=0 && currentFuelLevel <= 250000) 
    			return 250000-currentFuelLevel;
    		else
    			throw new InvalidFlightException("Invailid fuel Level for "+flightName);
    	}
    	else if(flightName.equalsIgnoreCase("Vistara")) {
    		if(currentFuelLevel >=0 && currentFuelLevel <= 300000) 
    			return 300000-currentFuelLevel;
    		else
    			throw new InvalidFlightException("Invailid fuel Level for "+flightName);
    	}
    	else if(flightName.equalsIgnoreCase("SpiceJet")) {
    		if(currentFuelLevel >=0 && currentFuelLevel <= 200000) 
    			return 200000-currentFuelLevel;
    		else
    			throw new InvalidFlightException("Invailid fuel Level for "+flightName);
    	}
    	else
    		throw new InvalidFlightException("No Flight found with name : "+flightName);
    }
}

class InvalidFlightException extends Exception {
	public InvalidFlightException(String message) {
		System.out.println(message);
	}
}

public class AeroVigil {

	public static void main(String[] args) throws InvalidFlightException {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Flight Details : ");
        String input = sc.nextLine();
        
        String[] arr = input.split(":");
        
        FlightUtility flight = new FlightUtility();
       
        if(flight.validateFlightNumber(arr[0]))
        	if( flight.validateFlightName(arr[1]))
        		if(flight.validatePassengerCount(Integer.valueOf(arr[2]), arr[1]))
        				System.out.println("Fuel Required to fill the tank :"+flight.calculateFuelToFillTank(arr[1], Integer.valueOf(arr[3])));
        
	}

}