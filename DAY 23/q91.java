Ques 91

import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagram(String str1, String str2) {
        // Remove spaces and convert to lowercase for uniform comparison
        String cleanStr1 = str1.replaceAll("\\s", "").toLowerCase();
        String cleanStr2 = str2.replaceAll("\\s", "").toLowerCase();
        
        if (cleanStr1.length() != cleanStr2.length()) {
            return false;
        }
        
        // Convert to arrays, sort them, and compare
        char[] charArray1 = cleanStr1.toCharArray();
        char[] charArray2 = cleanStr2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";
        System.out.println("Are \"" + s1 + "\" and \"" + s2 + "\" anagrams? " + isAnagram(s1, s2)); // true
    }
}