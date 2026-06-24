Ques 93

public class StringRotation {
    public static boolean isRotation(String str1, String str2) {
        // Check if lengths match and strings are not null/empty
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }
        
        // Concatenate str1 with itself
        String concatenated = str1 + str1;
        
        // Check if str2 is present inside the concatenated string
        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        System.out.println("Is rotation? " + isRotation(s1, s2)); // true
    }
}