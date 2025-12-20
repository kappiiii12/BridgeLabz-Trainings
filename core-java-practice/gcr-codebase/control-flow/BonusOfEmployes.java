import java.util.Scanner;

public class BonusOfEmployes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your years of Experience : ");
        double yearOfExperience = sc.nextDouble();
        System.out.println("Enter your salary : ");
        double salary = sc.nextDouble();
        double bonus =  (yearOfExperience/100)*salary;
        System.out.println("Your bonus is : "+bonus);
        sc.close();
    }
}
