import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height : ");
        float height = sc.nextInt();
        System.out.println("enter base : ");
        float base = sc.nextInt();
        double area  = 0.5 * height * base ;
         System.out.println("Area of triangle : "+ area);

         sc.close();
    }
}
