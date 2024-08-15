package String;
/*
 You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Example 2:
Input: jewels = "z", stones = "ZZ"
Output: 0
 */

import java.util.HashSet;

public class Qu11_Jewels_And_Stones_771 {
    public static void main(String[] args) {
        System.out.println("Jewels and Stones");
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }
    static int numJewelsInStones(String jewels,String stones){
        int cnt = 0;
        for(int i = 0;i<stones.length();i++){
            if(jewels.contains(String.valueOf(stones.charAt(i)))){
                cnt++;
            }
        }
        return cnt;
    }
   // Using Hash Set
    static int numJewelsInStonesUsingHashSet(String jewels,String stones){
        int cnt= 0;
        HashSet<Character> set = new HashSet<>();
        for(int x : jewels.toCharArray()){
            set.add((char)x);
        }
        // check
        for(int i = 0;i<stones.length();i++){
            if(set.contains(stones.charAt(i))){
                cnt++;
            }
        }
        return cnt;

    }
}
