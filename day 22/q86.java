Ques 86 

public class WordCount {
    public static int countWords(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return 0;
        }
        // Split by one or more whitespace characters
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }
    public static void main(String[] args) {
        String text = "Data Structures and Algorithms";
        System.out.println("Word count: " + countWords(text)); // 4
    }
}