

import java.util.Scanner ;
public class DistanceInYardsAndMiles2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ther distance in feet :");
        double distanceFeet = sc.nextDouble();
        double distanceYards = distanceFeet / 3 ;
        double distanceMiles = distanceYards/1768 ;

        System.out.println("distance in yards : "+ distanceYards);
        System.out.println("distance in miles : "+ distanceMiles);
        sc.close();
    }
}
