package reveiws;
import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {
        String text = "Java";
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char c : text.toCharArray()) {
            if (c == ' ') continue;


            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        
        System.out.println("Character Frequencies:");
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}