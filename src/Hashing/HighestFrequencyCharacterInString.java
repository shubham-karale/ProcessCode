package Hashing;

import java.util.HashMap;

public class HighestFrequencyCharacterInString {
    public static void main(String[] args) {
        System.out.println("Highest Frequency Character in String");
        String str = "abcaabbc";
        HashMap<Character,Integer> hm = new HashMap<>();
        // Using for each loop
        for(char ch : str.toCharArray()){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)+1);
            }else{
                hm.put(ch,1);
            }
        }
        int max = Integer.MIN_VALUE;
        char ans = ' ';
        for(char ch : hm.keySet()){
            if(hm.get(ch) > max){
                max = hm.get(ch);
                ans = ch;
            }
        }
    }
    static Character highestFrquencyOfAnCharacterInString(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(ch)) {
                // Old Frequency
                int of = hm.get(ch);
                // New Frequency
                int nf = of + 1;
                // Update the Frequency
                hm.put(ch, nf);
            }
            else{
            hm.put(ch, 1);
        }
    }
        // Find the Maximum Frequency
        int max = Integer.MIN_VALUE;
        char ans = ' ';
        for (char ch : hm.keySet()) {
            if (hm.get(ch) > max) {
                max = hm.get(ch);
                ans = ch;
            }
        }
        return ans;
    }

}
