package String;

import java.util.Arrays;
import java.util.HashMap;

public class Qu3_ValidAnagram {

    static boolean validAnagramArray(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        int [] count = new int[26];
        for(int i = 0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i = 0;i<count.length;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }

    //validAnagram using hashmap
    static boolean validAnagramUsingHashMap(String s,String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i< s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i = 0;i< t.length();i++){
            char ch = t.charAt(i);
            // If the character is not present in the map...
            if(!map.containsKey(ch)){
                return false;
            }
            // Frequency of the character is 1...
            else if(map.get(ch) == 1 ){
                map.remove(ch);
            }
            // Frequency of the character is greater than 1...
            else {
                map.put(ch,map.get(ch) - 1);
            }
        }
        return true;
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
    public static void main(String[] args) {
        System.out.println("Valid Anagram");
        String s = "anagram";
        String t = "anagram";

        System.out.println(validAnagram(s,t));


    }
}
