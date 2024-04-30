package Arrays;

import java.util.Arrays;

public class Qu7_LargestSubsequenceOfAnArrays {
     static int longestSubsequence(int [] nums,int n){
         int cnt = 0;
         int longer = 1;
         int lastSmaller = Integer.MIN_VALUE;
         if(n==0){
             return 0;
         }
         // Sort the Arrays
         Arrays.sort(nums);
         for (int i = 0; i < n ; i++) {
//             Case 1: next ele is prev + 1 arr[i] = lastSmaller + 1 =  lastSmaller = arr[i] - 1;
//              If Ans is yes then increment cnt and lastSmaller = nums[i]
             if(nums[i]-1 == lastSmaller){
                 cnt++;
                 lastSmaller = nums[i];
             }
             // nums[i] -1 != lastSmaller make cnt = 0 and lastSmaller  = nums[i];
             else if(nums[i] != lastSmaller){
                 lastSmaller = nums[i];
                 cnt = 1;
             }

//             check which greater is longer greater than cnt or cnt > longer
             longer = Math.max(longer,cnt);

         }

         return longer;
     }
    public static void main(String[] args) {
        System.out.println("Longest Subsequence of An Arrays");
        int [] nums = {5, 8, 3, 2, 1, 4};
        int n = nums.length;
        System.out.println(longestSubsequence(nums,n));

    }
}
