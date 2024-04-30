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

    static int[] reArrangeArrays(int[] nums, int n) {
        int l = 0;
        int r = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                l = i;
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
