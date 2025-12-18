import java.util.Scanner;
public class AreaOfTriangle2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height in meter: ");
        float height = sc.nextFloat();
        System.out.println("enter base in meter : ");
        float base = sc.nextFloat();
        double area  = 0.5 * height * base ; 
        double areaCmSq = area*10000 ;
        double areaInchSq = areaCmSq /6.4516;
         System.out.println("Area of triangle in meter sq. : "+ area);
          System.out.println("Area of triangle in inches sq. : "+ areaCmSq);
           System.out.println("Area of triangle in cm sq. : "+ areaInchSq);

         sc.close();
    }
}
