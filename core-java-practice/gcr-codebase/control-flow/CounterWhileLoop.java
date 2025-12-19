import java.util.Scanner;

public class CounterWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the countimg you want : ");
        int counter = sc.nextInt();
        
        while(counter >= 1){
            System.out.println("Counter : "+counter);
            counter--;
        }
        System.out.println("||| ROCKET LAUNCHED |||");
        sc.close();
    }
}
