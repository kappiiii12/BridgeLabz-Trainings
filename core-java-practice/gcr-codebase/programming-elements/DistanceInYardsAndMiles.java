
// Write a program the find the distance in yards and miles for the distance provided by user in feets
// Hint => 1 mile = 1760 yards and 1 yard is 3 feet
// I/P => distanceInFeet
// 
import java.util.Scanner ;
public class DistanceInYardsAndMiles {
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
