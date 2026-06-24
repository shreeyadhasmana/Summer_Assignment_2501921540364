Ques 95

public class LongestWord {
    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        // Split by one or more whitespace spaces
        String[] words = sentence.trim().split("\\s+");
        String longest = "";

        for (String word : words) {
            // Strip punctuation attached to words if necessary, e.g., "programming." -> "programming"
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");
            
            if (cleanWord.length() > longest.length()) {
                longest = cleanWord;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        String sentence = "I am learning Object-Oriented Java Programming.";
        System.out.println("Longest word: " + findLongestWord(sentence)); // Programming
    }
}