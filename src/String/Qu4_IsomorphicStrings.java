package String;

import java.util.HashMap;

/*
  Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true
Example 2:
Input: s = "foo", t = "bar"
Output: false
Example 3:
Input: s = "paper", t = "title"
Output: true
 */
public class Qu4_IsomorphicStrings {

    static boolean isIsomophic(String s,String t){
        if(s.length()!= t.length()){
            return false;
        }
       int [] map1 = new int[256];
        int [] map2 = new int[256];
        for(int i = 0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            // * If the mapping of the characters is not equal...
            if(map1[ch1] != map2[ch2]){
                return false;
            }
            // * If the mapping of the characters is zero...
            map1[ch1] = i+1;
            map2[ch2] = i+1;
        }
        return true;
    }
    static boolean isIsomorphicUsingHashMap(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        // * Create a hashmap to store the mapping of characters from s to t...
        HashMap<Character,Character> map = new HashMap<>();
        for(int i = 0;i< s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            // * If the character is already present in the map...
            if(map.containsKey(ch1)){
                // * If the value of the key is not equal to the character in t...
                if(map.get(ch1) != ch2){
                    return false;
                }
            }
            // * If the value is already present in the map...
            else if(map.containsValue(ch2)){
                return false;
            }
            else {
                map.put(ch1,ch2);
            }
        }
        return true;
    }

    static boolean isIsmorphicStringsHashMapIdealApproach(String s,String t){
        // * If the length of the strings is not equal...
        if(s.length() != t.length()){
            return false;
        }
        int n = s.length();
        // Create two HashMap for storing the mapping of characters from s to t and t to s...
        HashMap<Character,Character> st = new HashMap<>();
        HashMap<Character,Character> ts = new HashMap<>();

        // Iterate Loop and Add and check the Mapping
        for(int i = 0;i<n;i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            // * If the character is already present in the map...
            if(!st.containsKey(s1)){
                st.put(s1,t1);
            }

            if(!ts.containsKey(t1)){
                ts.put(t1,s1);
            }

            if(st.get(s1) != t1 || ts.get(t1) != s1 ) {
                return false;
            }
        }

        return true;


    }

    public static void main(String[] args) {
        System.out.println("Isomorphic Strings");
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphicUsingHashMap(s,t));
        String s1 = "foo";
        String t1 = "bar";
        System.out.println(isIsomorphicUsingHashMap(s1,t1));
        System.out.println(isIsmorphicStringsHashMapIdealApproach(s,t));
        System.out.println(isIsmorphicStringsHashMapIdealApproach(s1,t1));

    }
}
