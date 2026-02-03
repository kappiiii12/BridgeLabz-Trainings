package OceanFleet;

public class Vessel {
private String vesselId ;
private String vesselName;
private double vessleSpeed;
private String vesselType;
public Vessel() {}
public Vessel(String vesselId, String vesselName, double vessleSpeed, String vesselType) {
	super();
	this.vesselId = vesselId;
	this.vesselName = vesselName;
	this.vessleSpeed = vessleSpeed;
	this.vesselType = vesselType;
}
public String getVesselId() {
	return vesselId;
}
public void setVesselId(String vesselId) {
	this.vesselId = vesselId;
}
public String getVesselName() {
	return this.vesselName;
}
public void setVesselName(String vesselName) {
	this.vesselName = vesselName;
}
public double getVessleSpeed() {
	return vessleSpeed;
}
public void setVessleSpeed(double vessleSpeed) {
	this.vessleSpeed = vessleSpeed;
}
public String getVesselType() {
	return this.vesselType;
}
public void setVesselType(String vesselType) {
	this.vesselType = vesselType;
}


}
