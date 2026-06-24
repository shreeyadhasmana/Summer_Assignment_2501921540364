Ques 90 

import java.util.HashSet;

public class FirstRepeating {
    public static char findFirstRepeating(String str) {
        HashSet<Character> seen = new HashSet<>();
        
        for (char ch : str.toCharArray()) {
            if (seen.contains(ch)) {
                return ch; // Found the first character that repeats
            }
            seen.add(ch);
        }
        
        return '\0'; // Return null character if no character repeats
    }

    public static void main(String[] args) {
        String text = "google";
        char result = findFirstRepeating(text);
        if (result != '\0') {
            System.out.println("First repeating character in \"" + text + "\" is: " + result); // 'o'
        } else {
            System.out.println("No repeating character found.");
        }
    }
}