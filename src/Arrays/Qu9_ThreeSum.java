package Arrays;

import java.util.*;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
Example 1:
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation:
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
 */
/*
    [-1,0,1,2,-1,-4]
 * Step 1: Sort the input array
 *Step 2 : Initialize a set to store the unique triplets and an output vector to store the final result
 * Step 3: Iterate through the array with a variable i, starting from index 0.
 * Step 4: Initialize two pointers, j and k, with j starting at i+1 and k starting at the end of the array.
 * Step 5:In the while loop, check if the sum of nums[i], nums[j], and nums[k] is equal to 0. If it is, insert the triplet into the set and increment j and decrement k to move the pointers.
 * Step 6:If the sum is less than 0, increment j. If the sum is greater than 0, decrement k.
 *Step 7:  After the while loop, iterate through the set and add each triplet to the output vector.
 * Step 8: Return the output vector
 */

public class Qu9_ThreeSum {
    public static void main(String[] args) {
        System.out.println("3 Sum Problem");
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int[] num1 = {0, 1, 1};
        int[] nums2 = {0, 0, 0};
        int n = nums.length;
        int target = 0;
        System.out.println(threeSum(nums, n, target));
    }

    private static List<List<Integer>>  threeSum(int[] nums, int n, int target) {
//        Sort the Arrays
        Arrays.sort(nums);
//        Create Set to Store the Unique Pairs
        Set<List<Integer>> s = new HashSet<>();
//        Create List of List to Store the Pairs at final
        List<List<Integer>> ans = new ArrayList<>();
//        Iterate Loop
        for(int i = 0;i<n;i++){
            int j  = i+1;
            int k = n-1;

            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum==target)
                {
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k++;
                }
                else if(sum < target){
//                    ! Increment j pointer
                    j++;
                }
//                * If Sum > Target  =  decrement k pointer
                else {
                    k++;
                }
            }


        }
        ans.addAll(s);
        return ans;
    }
}

// !  CPP

/* *
 *       vector<vector<int>> threeSum(vector<int>& nums) {
        int target = 0;
        sort(nums.begin(), nums.end());
        set<vector<int>> s;
        vector<vector<int>> output;
        for (int i = 0; i < nums.size(); i++){
            int j = i + 1;
            int k = nums.size() - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    s.insert({nums[i], nums[j], nums[k]});
                    j++;
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        for(auto triplets : s)
            output.push_back(triplets);
        return output;
    }

 */