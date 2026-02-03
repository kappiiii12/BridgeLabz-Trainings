package OceanFleet;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		VesselUtil obj = new VesselUtil();
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of vessels to be added : ");
       int n = sc.nextInt();
       sc.nextLine();
       for(int i=1;i<=n;i++) {
    	   String input = sc.nextLine();
    	   String[] temp = input.split(":");
    	   obj.addVesselPerformance(new Vessel(temp[0],temp[1],Double.valueOf(temp[2]),temp[3]));
    	   }
       System.out.println("Enter the Vessel Id to check speed : ");
       String vId = sc.next();
       //V001 | Sea King | Cargo | 25.5 knots
       
       if(obj.getVesselById(vId) != null) {
    	   Vessel v = obj.getVesselById(vId);
    	   System.out.println(v.getVesselId()+" | "+v.getVesselName()+" | "+v.getVesselType()+" | "+v.getVessleSpeed()+" knots");
       }
       else
    	   System.out.println(" Vessel Id "+vId + " not found");
       System.out.println("High Performance Vessels are :");
       for(Vessel v :obj.getHighPerformanceVessels()) {
    	   System.out.println(v.getVesselId()+" | "+v.getVesselName()+" | "+v.getVesselType()+" | "+v.getVessleSpeed()+" knots");
       }
       
	}
   
}
