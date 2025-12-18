// Write a program that takes your height in centimeters and converts it into feet and inches
// Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
// I/P => height
// O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
import java.util.Scanner;
public class CmToFeetAndInches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double heightInInches = height/2.54;
         double heightInFeet = heightInInches/12;
         System.out.println("Your Height in cm is "+height+ " while in feet is "+heightInFeet+" and inches is "+heightInInches);
        sc.close();
    }
}
