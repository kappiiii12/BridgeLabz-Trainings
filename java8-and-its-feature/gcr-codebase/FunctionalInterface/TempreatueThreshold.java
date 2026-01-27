import java.util.function.Predicate;

public class TempreatueThreshold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double tempreature =32.2;
        double threshold = 30 ; 
         Predicate<Double> isTooHot = (temp) -> temp > threshold ;
         
         if(isTooHot.test(tempreature)) {
        	 System.out.println("!!!ALERT!!! -  TEMPREATURE IS TOO HOT   !!!!");
         }
         else
        	 System.out.println("Tempreaturn under Control");
	}

}
