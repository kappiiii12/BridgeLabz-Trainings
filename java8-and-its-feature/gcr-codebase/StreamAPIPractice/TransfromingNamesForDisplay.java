package StreamAPIPractice;
import java.util.*;
public class TransfromingNamesForDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> indianNames = new ArrayList<>(Arrays.asList(
	            "Arjun", "Deepika", "Ishaan", "Kavya", "Rohan", 
	            "Ananya", "Siddharth", "Meera", "Aditya", "Priyanka"
	        ));
		List<String> res = indianNames.stream()
				                      .map((x) -> x.toUpperCase())
				                      .sorted()
				                      .toList();
		for(String x : res)
			System.out.println(x);
	}

}
