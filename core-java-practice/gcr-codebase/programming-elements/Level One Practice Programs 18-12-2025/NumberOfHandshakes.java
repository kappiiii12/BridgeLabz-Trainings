import java.util.Scanner;
public class NumberOfHandshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        int handshakes = (numberOfStudents *(numberOfStudents-1))/2;

        System.out.println("Total number of handshakes : "+ handshakes);;
        sc.close();
    }
}
