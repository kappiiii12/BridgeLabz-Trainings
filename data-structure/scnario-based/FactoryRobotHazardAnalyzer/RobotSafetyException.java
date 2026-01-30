package FactoryRobotHazardAnalyzer;

public class RobotSafetyException extends Exception {
          public RobotSafetyException(String message) {
        	  System.out.println("Error : "+message);
          }
}
