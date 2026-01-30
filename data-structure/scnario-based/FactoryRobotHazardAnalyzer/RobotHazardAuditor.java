
package FactoryRobotHazardAnalyzer;

public class RobotHazardAuditor {

	public double calculateHazardRisk(double armPrecision, int workerDensity, String machineryState) throws RobotSafetyException {
		if(armPrecision < 0 || armPrecision > 1)
			throw new RobotSafetyException("Arm precision must be 0.0-1.0");
		
		if(workerDensity<1 || workerDensity>20)
			throw new RobotSafetyException("Worker density must be 1-20");
		if(machineryState.equals("Worn")&& machineryState.equals("Faulty") && machineryState.equals("Critical") )
			throw new RobotSafetyException(" Unsupported machinery state");
		
		double machineRiskFactor ;
		if(machineryState == "Worn" )
			machineRiskFactor = 1.3;
		else if(machineryState == "Faulty" )
			machineRiskFactor = 2.0;
		else
			machineRiskFactor = 3.0;
		double hazardRisk = ((1.0-armPrecision)*15.0 ) +( workerDensity * machineRiskFactor);
		return hazardRisk;
	}

}
