Ques 88 

public class RemoveSpaces {
    public static void main(String[] args) {
        String original = "  Keep   Learning  Java  ";
        
        // \\s matches any whitespace character (space, tab, etc.)
        String result = original.replaceAll("\\s", "");
        
        System.out.println("Original: " + original);
        System.out.println("Modified: " + result); // KeepLearningJava
    }
}