Ques 92

public class MaxOccurringChar {
    public static char getMaxOccurringChar(String str) {
        // Frequency array for all 256 ASCII characters
        int[] count = new int[256];
        
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        
        int max = -1;
        char result = ' ';
        
        // Traverse the string to find the character with highest frequency
        for (int i = 0; i < str.length(); i++) {
            if (max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        String text = "test string";
        System.out.println("Maximum occurring character is: '" + getMaxOccurringChar(text) + "'"); // 't'
    }
}