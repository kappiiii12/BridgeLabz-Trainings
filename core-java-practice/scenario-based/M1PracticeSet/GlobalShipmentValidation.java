//package RegexPractice;

import java.util.Scanner;

//SHIP-&lt;CODE&gt;|&lt;SHIP_DATE&gt;|&lt;MODE&gt;|&lt;WEIGHT&gt;|&lt;DELIVERY_STATUS&gt;
public class GlobalShipmentValidation {
	public static boolean validateCode(String str) {
		String regex = "^SHIP-(?!0)(?!\\d*(\\d)\\1{3})\\d{6}$";
		return str.matches(regex);
	}
	public static boolean validateDate(String str) {
	String[] arr = str.split("-");
	int year = Integer.parseInt(arr[0]);
	if(year < 2000 || year > 2099) return false;
	int month = Integer.parseInt(arr[1]);
	if(month <1 || month > 12) return false;
	int[] days = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	if((month%4==0 && month%100!=0 )|| month%400==0)
		days[month] =29;
	int d =Integer.parseInt(arr[2]);
	if(d < 1 || d > days[month]) return false ;
	
	return true;
 	}
	public static boolean validateMode(String str) {
		return str.matches("AIR") || str.matches("SEA") || str.matches("ROAD") || str.matches("RAIL") || str.matches("EXPRESS") ||str.matches("FRIEGH") ;
	}
	public static boolean validateWeight(String str) {
		String regex = "(0|[1-9]\\d{0,5})(\\.\\d{1,2})?";
		return str.matches(regex);
	}
	public static boolean validateStatus(String str) {
		return str.matches("DELIVERED") || str.matches("CANCELLED") || str.matches("IN_TRANSIT") ;
	}
	public static String validateInput(String str) {
		String[] arr = str.split("\\|");
				if(!validateCode(arr[0])) return "NON-COMPLIANT RECORD" ;
				if(!validateDate(arr[1])) return "NON-COMPLIANT RECORD" ;
				if(!validateMode(arr[2])) return "NON-COMPLIANT RECORD" ;
				if(!validateWeight(arr[3])) return "NON-COMPLIANT RECORD" ;
				if(!validateStatus(arr[4])) return "NON-COMPLIANT RECORD" ;
		return "COMPLIANT RECORD";
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	sc.nextLine();
	for(int i=1;i<=n;i++) {
		String temp = sc.nextLine();
		System.out.println(validateInput(temp));
	}
}
}
//SHIP-123456|2024-02-29|AIR|5000.50|DELIVERED
//SHIP-023456|2024-02-29|SEA|5000.50|DELIVERED
//SHIP-111112|2023-05-20|ROAD|200.00|CANCELLED
//SHIP-654321|2023-04-31|RAIL|150.75|DELIVERED
//SHIP-987654|2023-02-29|AIR|100.00|IN_TRANSIT
//SHIP-345678|2021-09-15|SEA|050.00|DELIVERED
//SHIP-456789|2022-11-10|DRONE|999.99|CANCELLED
//SHIP-567890|2022-12-25|EXPRESS|1000000.00|DELIVERED
//SHIP-678901|2020-06-30|FREIGHT|999999.99|SHIPPED
//SHIP-789012|2004-02-29|ROAD|0.75|IN_TRANSIT
