Ques 94
public class StringCompression {
    public static String compress(String str) {
        if (str == null || str.isEmpty()) return str;

        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            // If next character is the same, increment count
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Append character and its consecutive count
                compressed.append(str.charAt(i)).append(count);
                count = 1; // Reset counter
            }
        }

        // Return original if compressed version is not shorter
        return compressed.length() < str.length() ? compressed.toString() : str;
    }

    public static void main(String[] args) {
        String text = "aabcccccaaa";
        System.out.println("Compressed: " + compress(text)); // a2b1c5a3
    }
}