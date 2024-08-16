package Hashing;

import java.util.*;
import java.util.List;

public class FindTheCommonElementOfBothArrays {
    public static void main(String[] args) {
        System.out.println("Find the Common Element of Both Arrays");
        int[] arr1 = {1, 1, 2, 2, 3, 4, 8, 9, 6};
        int[] arr2 = {1, 1, 2, 3, 4, 8, 6};
        List<Integer> ans = findCommonElements(arr1, arr2);
        System.out.println(ans);

    }

    // Using HashSet
    static List<Integer> findCommonElements(int[] arr1, int[] arr2) {
        List<Integer> ans = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])) {
                ans.add(arr2[i]);
                hs.remove(arr2[i]);
            }
        }
        return ans;
    }

    // using HashMap
    static List<Integer> findCommonElementsUsingHashMap(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            if (mp.containsKey(arr1[i])) {
                mp.put(arr1[i], mp.get(arr1[i]) + 1);
            } else {
                mp.put(arr1[i], 1);
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            if (mp.containsKey(arr2[i]) && mp.get(arr2[i]) > 0) {
                ans.add(arr2[i]);
                mp.put(arr2[i], mp.get(arr2[i]) - 1);
            }
        }
        return ans;
    }
}
