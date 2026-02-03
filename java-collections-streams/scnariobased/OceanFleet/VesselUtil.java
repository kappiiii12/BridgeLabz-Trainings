package OceanFleet;
import java.util.*;
public class VesselUtil {
    private List<Vessel> vesselList  = new ArrayList<>();
    
    public void addVesselPerformance(Vessel vessel) {
    	vesselList.add(vessel);
    }
     public Vessel getVesselById(String vesselId) {
    	 for(Vessel x : vesselList ) {
    		 if(x.getVesselId().equals(vesselId))
    			 return x;
    	 }
    	 return null;
     }
     public List<Vessel> getHighPerformanceVessels() {
         List<Vessel> highPerformers = new ArrayList<>();
         
         if (vesselList == null || vesselList.isEmpty()) {
             return highPerformers;
         }

         // 1. Find the maximum speed among all vessels
         double maxSpeed = -1.0;
         for (Vessel v : vesselList) {
             if (v.getVessleSpeed() > maxSpeed) {
                 maxSpeed = v.getVessleSpeed();
             }
         }

         // 2. Collect all vessels that match this maximum speed
         for (Vessel v : vesselList) {
             if (v.getVessleSpeed() == maxSpeed) {
                 highPerformers.add(v);
             }
         }

         return highPerformers;
     }
}
