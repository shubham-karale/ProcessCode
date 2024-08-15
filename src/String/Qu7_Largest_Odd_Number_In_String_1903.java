package String;

public class Qu7_Largest_Odd_Number_In_String_1903 {
    public static void main(String[] args) {
        System.out.println("Largest Odd Number in String");
        String num = "35427";
        System.out.println(largestOddNumber(num));
    }

    static String largestOddNumber(String num) {
        int n = num.length();
        for (int i = n - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}

