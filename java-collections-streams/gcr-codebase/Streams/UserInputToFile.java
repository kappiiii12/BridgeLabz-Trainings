import java.io.*;

public class UserInputToFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("user_info.txt")) {

            System.out.print("Enter Name: ");
            String name = reader.readLine();
            System.out.print("Enter Age: ");
            String age = reader.readLine();
            System.out.print("Favorite Language: ");
            String lang = reader.readLine();

            writer.write("Name: " + name + "\nAge: " + age + "\nLanguage: " + lang);
            System.out.println("Data saved to user_info.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}