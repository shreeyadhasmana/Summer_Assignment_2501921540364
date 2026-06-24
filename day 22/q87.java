Ques 87

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void findFrequency(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();
        
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        
        // Print the frequencies
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        findFrequency("hello");
    }
}