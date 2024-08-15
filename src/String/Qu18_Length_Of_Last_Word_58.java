package String;
/*
 Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.
Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 */

public class Qu18_Length_Of_Last_Word_58 {
    public static void main(String[] args) {
        System.out.println("Length of Last Word");
        String s = "Hello World";
        String s1 = "   fly me   to   the moon  ";
        String s2 = "luffy is still joyboy";
        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord(s1));
        System.out.println(lengthOfLastWord(s2));
    }
    static int lengthOfLastWord(String str){
        int n = str.length();
        int count = 0;
        // Run loop till the i become 0
        for(int i = n-1;i>=0;i--){
            if(str.charAt(i) != ' '){
                 count++;
            }
            // If we encounter empty space then check whether the count is greater than 0 then just return the count
            else {
                if(count > 0){
                    return count;
                }
            }
            return count;
        }
      return count;


    }
    // Method 2 using split
    static int lengthOfLastWords(String s){
        String [] words = s.split(" ");
        int n = words.length;
        // Traverse the string from the end
        for(int i = n-1;i>=0;i--){
            // If the word is not empty then return the length of the word
            if(!words[i].equals("")){
                return words[i].length();
            }
        }
        return 0;
    }
}

