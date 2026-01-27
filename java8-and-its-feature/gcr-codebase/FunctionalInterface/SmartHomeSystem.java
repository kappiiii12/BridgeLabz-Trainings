import java.util.*;

      interface IsSmart {
      public void turnOFF();
      public void turnON();
}


 class AirConditionar  implements IsSmart{
	@Override
     public void turnOFF() {
    	 System.out.println("AC Turned OFF");
     }
	@Override
     public void turnON() {
    	 System.out.println("AC Turned ON");
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
 class Light implements IsSmart {

	@Override
	public void turnOFF() {
		// TODO Auto-generated method stub
          System.out.println("Light Turned OFF");
	}

	@Override
	public void turnON() {
		// TODO Auto-generated method stub
           System.out.println("Lights Turned ON");
	}

}
 class TeleVision implements IsSmart {

	@Override
	public void turnOFF() {
		// TODO Auto-generated method stub
        System.out.println("TV Turned ON");
	}

	@Override
	public void turnON() {
		// TODO Auto-generated method stub
		 System.out.println("TV Turned ON");
	}

}

public class SmartHomeSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          TeleVision tv = new TeleVision();
          Light l = new Light();
          AirConditionar ac = new AirConditionar();
          
          ArrayList<IsSmart> list = new ArrayList<>( Arrays.asList(tv,l,ac));
          
          for(IsSmart x : list) {
        	  x.turnON();
        	  x.turnOFF();
          }
	}

}
