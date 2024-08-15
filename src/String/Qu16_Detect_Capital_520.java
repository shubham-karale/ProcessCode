package String;

public class Qu16_Detect_Capital_520 {
    public static void main(String[] args) {
        System.out.println("Detect Capital");
        String word1 = "USA";
        String word2 = "FlaG";
        System.out.println(detectCapital(word1));
        System.out.println(detectCapital(word2));
    }

    static boolean detectCapital(String word) {
        int n = word.length();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                sb.append(word.charAt(i));
            }
        }
        count = sb.length();
        if (count == n || count == 0) {
            return true;

        }
        return false;
    }
}