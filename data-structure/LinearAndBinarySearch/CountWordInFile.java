import java.io.*;

public class CountWordInFile {
    public static void main(String[] args) {
        String targetWord = "Java";
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String w : words) {
                    if (w.equalsIgnoreCase(targetWord)) count++;
                }
            }
            System.out.println("Occurrences: " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}