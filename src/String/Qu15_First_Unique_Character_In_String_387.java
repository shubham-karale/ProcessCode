package String;

import java.util.HashMap;

public class Qu15_First_Unique_Character_In_String_387 {
    public static void main(String[] args) {
        System.out.println("First Unique Character in a String");
        String s = "leetcode";
        String t = "loveleetcode";
        System.out.println(firstUniqueChar(s));
        System.out.println(firstUniqueChar(t));
    }

    // Using HashMap
    static int firstUniqueChar(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        char [] ch = str.toCharArray();
        for (char c : ch) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < ch.length; i++) {
            if (map.get(ch[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
}
