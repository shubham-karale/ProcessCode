package Arrays;
/*
  Given an integer array nums of unique elements, return all possible
subsets
 (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.
Example 1:
Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
Example 2:

Input: nums = [0]
Output: [[],[0]]
 */

/*
  * LOGIC
  * 1. Create a list of list of integers to store the result
  * 2. Create a backtrack function to get the subsets
  * 3. In the backtrack function, add the current subset to the result
  * 4. Iterate through the array and add the current element to the subset
  * 5. Recursively call the backtrack function with the updated subset
  * 6. Remove the current element from the subset
  * 7. Continue the iteration
  * 8. Return the result
 */

import java.util.ArrayList;
import java.util.List;

public class Qu10_Subsets {
    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    static void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {
        // Add the current subset to the result
        result.add(new ArrayList<>(temp));
        // Iterate through the array
        for (int i = start; i < nums.length; i++) {
            // Accept Elements
            temp.add(nums[i]);
            // backtrack
            backtrack(result, temp, nums, i + 1);
            // Remove the current element from the subset
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Subsets of [1,2,3] are: ");
        int[] nums = {1,2,3};
        System.out.println(subsets(nums));

    }
}
