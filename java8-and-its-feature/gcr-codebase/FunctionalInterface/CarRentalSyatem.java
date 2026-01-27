
import java.util.*;

interface RentOrReturn {
  void rent();
  void returnVehicle();
}

public class CarRentalSyatem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Bike bike = new Bike();
       Car car = new Car();
       Bus bus = new Bus();
       
       ArrayList<RentOrReturn> list = new ArrayList<>(Arrays.asList(bike,car,bus));
       
       for(RentOrReturn x : list) {
    	   x.rent();
    	   x.returnVehicle();
       }
	}

}

 class Bike implements RentOrReturn {

	@Override
	public void rent() {
		// TODO Auto-generated method stub
       System.out.println("Bike Booked For Rent");
	}

	@Override
	public void returnVehicle() {
		// TODO Auto-generated method stub
		System.out.println("Bike Returned");
	}

}
class Bus implements RentOrReturn {

	@Override
	public void rent() {
		// TODO Auto-generated method stub
		System.out.println("Bus Booked For Rent");
	}

	@Override
	public void returnVehicle() {
		// TODO Auto-generated method stub
		System.out.println("Bus Returned");
	}

}
class Car implements RentOrReturn {

	@Override
	public void rent() {
		// TODO Auto-generated method stub
		System.out.println("Car Booked For Rent");
	}

	@Override
	public void returnVehicle() {
		// TODO Auto-generated method stub
		System.out.println("Car Returned");
	}

}
