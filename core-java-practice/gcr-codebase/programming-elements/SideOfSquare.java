import java.util.Scanner ;

public class SideOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parameter of Square");
        int parameter = sc.nextInt();
        int side = parameter/4;

        System.out.println("Side of square is : "+ side +" whose parameter is : "+ parameter);
        sc.close();
    }
}
