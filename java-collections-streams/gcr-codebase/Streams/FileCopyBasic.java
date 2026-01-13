import java.io.*;

public class FileCopyBasic {
    public static void main(String[] args) {
        File source = new File("source.txt");
        File dest = new File("destination.txt");

        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest)) {
            
            int data;
            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File copied successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Source file not found.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}