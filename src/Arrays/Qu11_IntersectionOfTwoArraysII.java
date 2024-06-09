package Arrays;
/*
Code
Testcase
Test Result
Test Result
350. Intersection of Two Arrays II
Easy
Topics
Companies
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Qu11_IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        System.out.println("Intersection of Two Arrays II");
        int [] nums1 = {1,2,2,1};
        int [] nums2= {2,2};
        int [] nums3 = {4,9,5};
        int [] nums4  ={9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
        System.out.println(Arrays.toString(intersect(nums3, nums4)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        // * Sort both the arrays first...
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // * Create an array list...
        ArrayList<Integer> arr = new ArrayList<Integer>();
        // * Use two pointers i and j for the two arrays and initialize both with zero.
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
            // If nums1[i] is less than nums2[j]...
            // Leave the smaller element and go to next(greater) element in nums1...
            if(nums1[i] < nums2[j]) {
                i++;
            }
            // If nums1[i] is greater than nums2[j]...
            // Go to next(greater) element in nums2 array...
            else if(nums1[i] > nums2[j]){
                j++;
            }
            // If both the elements intersected...
            // Add this element to arr & increment both i and j.
            else{
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        // Create a output list to store the output...
        int[] output = new int[arr.size()];
        int k = 0;
        while(k < arr.size()){
            output[k] = arr.get(k);
            k++;
        }
        return output;
    }
    // * Using HashMap
    /*
       * Create HashMap
       * Iterate through the first array and add the elements to the HashMap
       * Iterate through the second array and check if the element is present in the HashMap
       * If present, add the element to the result and decrement the count in the HashMap
     */
    static int [] intersectUsingHashMap(int [] nums1, int [] nums2){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        // Add Elements to the HashMap
        for(int i = 0; i < nums1.length; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }
        // Check if the element is present in the HashMap
        for(int i = 0; i < nums2.length; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                arr.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i]) - 1);
            }
        }
        int [] output = new int[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            output[i] = arr.get(i);
        }

        return output;
    }
}
