package String;
/*
Given a string s, return true if the s can be palindrome after deleting at most one character from it.
Example 1:
Input: s = "aba"
Output: true
Example 2:
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:
Input: s = "abc"
Output: false
 */

public class Qu17_ValidPalindrome_680 {
    public static void main(String[] args) {
        System.out.println("Valid Palindrome");
        String s = "abca";
        String s1 = "aba";
        String s2 = "abc";
        System.out.println(validPalindrome(s));
        System.out.println(validPalindrome(s1));
        System.out.println(validPalindrome(s2));
    }
    // Brute Force Approach
    static boolean validPalindrome(String s){
        int n = s.length();
        for(int i = 0;i<n;i++){
            StringBuilder sb = new StringBuilder(s);
            sb.deleteCharAt(i);
            if(isPalindrome(sb.toString())){
                return true;
            }
        }
        return isPalindrome(s);
    }
    static boolean isPalindrome(String s){
        int n = s.length();
        for(int i = 0;i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    // Two Pointer Approach
    static boolean validPalindromeTwoPointer(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
           // ! If the characters are not same then we have to check if the string is palindrome by removing one character from left or right
            if(s.charAt(i) != s.charAt(j)){
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1);
            }
            // * Keep moving the pointers if the characters are same
            i++;
            j--;
        }
        return true;
    }
    // ? Check if the string is palindrome or not
    static boolean isPalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
