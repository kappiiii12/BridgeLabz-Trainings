import java.util.*;

public class FrequencyCounter {
    public static Map<String, Integer> countFrequencies(List<String> input) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : input) {
            // If item exists, sum 1 to its value; otherwise, set it to 1.
            frequencyMap.merge(item, 1, Integer::sum);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "apple", "orange");
        System.out.println(countFrequencies(list)); 
        // Output: {orange=1, apple=2, banana=1}
    }
}