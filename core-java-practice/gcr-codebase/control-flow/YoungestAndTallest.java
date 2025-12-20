import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age of Amar : ");
        int amarAge = sc.nextInt();
        System.out.println("enter height of Amar : ");
        int amarHeight = sc.nextInt();
        System.out.println("enter age of Akbar : ");
        int akbarAge = sc.nextInt();
        System.out.println("enter height of Akbar : ");
        int akbarHeight = sc.nextInt();
        System.out.println("enter age of Anthony : ");
        int AnthonyAge = sc.nextInt();
        System.out.println("enter height of Anthony : ");
        int AnthonyHeight = sc.nextInt();

        if(amarAge < akbarAge && amarAge < AnthonyAge)
            System.out.println("Amar is Youngest");
        else if(akbarAge < amarAge && akbarAge < AnthonyAge)
            System.out.println("Akbar is Youngest");
        else
            System.out.println("Anthony is Youngest");

        if(amarHeight > akbarHeight && amarHeight > AnthonyHeight)
            System.out.println("Amar is Tallest");
        else if(akbarHeight > amarHeight && akbarHeight > AnthonyHeight)
            System.out.println("Akbar is Tallest");
        else
            System.out.println("Anthony is Tallest");

        sc.close();
    }
}
