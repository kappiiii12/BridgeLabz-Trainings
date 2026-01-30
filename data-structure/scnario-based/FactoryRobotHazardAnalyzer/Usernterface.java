package FactoryRobotHazardAnalyzer;

import java.util.Scanner;

public class Usernterface {

	public static void main(String[] args) throws RobotSafetyException {
		// TODO Auto-generated method stub
		RobotHazardAuditor r = new RobotHazardAuditor();
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Arm Precision (0.0 - 1.0): ");
         double armPrecision = sc.nextDouble();
         System.out.print("Enter Machinery State (Worn/Faulty/Critical): ");
         int workerDensity = sc.nextInt();
         System.out.print("Enter Machinery State (Worn/Faulty/Critical): ");
         String machineryState = sc.next();
         
         System.out.println("Robot Hazard Risk Score: "+ r.calculateHazardRisk(armPrecision, workerDensity, machineryState));
         sc.close();
	}

}
//Enter Arm Precision (0.0 - 1.0):
//0.5
//Enter Worker Density (1 - 20):
//10
//Enter Machinery State (Worn/Faulty/Critical):
//Critical
//
//Sample output 1:
//
//Robot Hazard Risk Score: 37.5