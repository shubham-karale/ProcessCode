package Arrays;

import java.util.*;

//Two Sum
// If the Given an arrays
public class Qu1_TwoSum {
      static String twoSum(int [] nums,int target){
//         Brute Force Solution
          boolean ans  = false;
          for(int i = 0;i<nums.length;i++){
              for(int j = i+1;j<nums.length;j++){
                  if(nums[i]+nums[j]==target){
                      return "TRUE";
                  }

              }
          }
          return "False";
      }

//      TODO: Cr
    /*
        Step 1: Sort the Arrays
        Steo 2: Create left and right pointer
        Step 3: run loop till l <= r and check arr[l] + arr[r] = target if get return true
        Step 4: if the sum < target  l++;
        Step 5: if the sum > target r--;

     */

//      Optimise Approach - Two Pointers Approach
    static boolean  twoSumOptimised(int[] nums,int target){

        Arrays.sort(nums);
        int lo = 0;
        int hi = nums.length-1;

        while(lo<=hi){
            if(nums[lo]+nums[hi]==target){
                return true;
            }
            else if(nums[lo]+nums[hi]< target){
                lo++;
            }
            else {
                hi--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Programme");
        System.out.println("Enter the Arrays Elements");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the Target Sum");
        int target = sc.nextInt();

        System.out.println(Arrays.toString(arr));
        System.out.println(twoSum(arr,target));
    }
}
