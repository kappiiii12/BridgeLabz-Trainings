import java.io.*;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        Map<String, Integer> wordCounts = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("story.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String w : words) {
                    if (!w.isEmpty()) wordCounts.put(w, wordCounts.getOrDefault(w, 0) + 1);
                }
            }
        } catch (IOException e) { e.printStackTrace(); }

        wordCounts.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(5)
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}