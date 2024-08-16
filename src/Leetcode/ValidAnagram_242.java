package Leetcode;
import java.net.Inet4Address;
import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram_242 {
    public static void main(String[] args) {
        System.out.println("Valid Anagram");
        String s = "anagram";
        String t = "anagram";
        String s1 = "rat";
        String t1 = "car";
        System.out.println(validAnagram(s, t));
        System.out.println(validAnagram(s1, t1));
    }
    static boolean validAnagram(String s,String t){
        char [] first = s.toCharArray();
        char [] second = t.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        if(first.length != second.length){
            return false;
        }

        for(int i = 0;i<first.length;i++){
            if(first[i] != second[i]){
                return false;
            }
    }
        return true;
    }
    // Using HashMap
    static boolean validAnagramUsingHashMap(String s,String t){
      if(s.length() != t.length()) return false;
      HashMap<Character,Integer> map = new HashMap<Character,Integer>();
      for(int i = 0;i<s.length();i++){
          char ch = s.charAt(i);
          //  map.put(ch,map.getOrDefault(ch,0)+1);
          map.put(ch,map.getOrDefault(ch,0)+1);

      }
        // check
        for(int i = 0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)){
                return false;
            }
            else if(map.get(ch) == 1){
                map.remove(ch);
            }
            else{
                map.put(ch,map.get(ch)-1);
            }
        }

      return true;


    }
}


