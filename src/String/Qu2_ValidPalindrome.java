package String;

public class Qu2_ValidPalindrome {
    static boolean checkValidPalindrome(String str){
        str = str.trim();
        int l = 0;
        int r = str.length()-1;
        boolean flag = false;
        while(l<=r){
           if(str.charAt(l)== str.charAt(r)){
               l++;
               r++;
           }


        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println("Valid Palindrome");
        String str = "A man, a plan, a canal: Panama";
        String str2 = "race a car";
        System.out.println(checkValidPalindrome(str));
        System.out.println(checkValidPalindrome(str));
    }
}
