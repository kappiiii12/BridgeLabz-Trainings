// Write a Program to compute the volume of Earth in km^3 and miles^3
// Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
// O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____


public class VolumeOfEarth {
    public static void main(String[] args) {
        int radius = 6378 ;
        double volumeKM = (4/3) * (Math.PI) * radius * radius * radius ;
        double VoumeMiles = volumeKM * 0.239913 ;
        System.out.println("The volume of earth in cubic kilometers is "+volumeKM+" and cubic miles is "+ VoumeMiles);
    }
}
