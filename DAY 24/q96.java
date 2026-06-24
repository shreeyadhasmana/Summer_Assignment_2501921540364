Ques 96

import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static String removeDuplicateChars(String str) {
        if (str == null || str.isEmpty()) return str;

        // LinkedHashSet maintains insertion order and blocks duplicates
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        // Build the final string from the unique characters
        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String text = "programming";
        System.out.println("After removing duplicates: " + removeDuplicateChars(text)); // progamn
    }
}