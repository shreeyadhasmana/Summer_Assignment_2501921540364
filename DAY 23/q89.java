Ques 89

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeating {
    public static char findFirstNonRepeating(String str) {
        Map<Character, Integer> counts = new LinkedHashMap<>();
        
        // Count frequencies while keeping insertion order
        for (char ch : str.toCharArray()) {
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }
        
        // Find the first key with a count of 1
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return '\0'; // Return null character if none found
    }

    public static void main(String[] args) {
        String text = "swiss";
        char result = findFirstNonRepeating(text);
        if (result != '\0') {
            System.out.println("First non-repeating character in \"" + text + "\" is: " + result); // 'w'
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}