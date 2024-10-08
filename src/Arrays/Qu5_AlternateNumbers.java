package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Qu5_AlternateNumbers {

    static void swap(int[] nums, int s, int e) {
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
    }

    //    ! Brute Force Time Complexity = O(n) Space Complexity = O(n)
    static Object[] reArrangeArraysBruteForce(int[] nums, int n) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> negs = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                negs.add(nums[i]);
            } else if (nums[i] > 0) {
                pos.add(nums[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                ans.add(pos.get(i));
            } else {
                ans.add(negs.get(i));

            }
        }
        return ans.toArray();

    }
    /*
    ! Optimized Approach
    * Time Complexity = O(n)
    * Space Complexity = O(1)
    - Assign the left and right to 0
    - Iterate over the Arrays
    - Check if the elements is greater than 0
    - If the element is greater than 0 then assign the left to i
    - If the element is less than 0 then assign the right to i
    - If the index is even then swap the element with left
    - If the index is odd and the element is less than 0 then swap the element with right

     */

    static int[] reArrangeArrays(int[] nums, int n) {
        // Assign the left and right to 0
        int l = 0;
        int r = 0;
        // Iterate over the Arrays
        for (int i = 0; i < nums.length; i++) {
            // Check if the elements is greater than 0
            if (nums[i] > 0)
                l = i; //
            else if (nums[i] < 0) r = i;

            if (i % 2 == 0) {
                swap(nums, i, l);
            } else if (nums[i] < 0) {
                swap(nums, i, r);
            }
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println("Alternate Numbers");
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] nums1 = {-1, 1};
        int n = nums.length;
        int n1 = nums1.length;

        System.out.println(Arrays.toString(reArrangeArrays(nums, n)));
        System.out.println(Arrays.toString(reArrangeArrays(nums1, n1)));
    }
}
