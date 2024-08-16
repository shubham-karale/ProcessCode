package Leetcode;

public class Find_In_Rotated_Sorted_Arrays_33 {
    public static void main(String[] args) {
        System.out.println("Find in Rotated Sorted Arrays");
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(searchInRotatedSortedArraysBruteForce(nums, target));
        System.out.println(searchInRotatedArrays(nums, target, nums.length));
    }

    static int searchInRotatedSortedArraysBruteForce(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int searchInRotatedArrays(int[] nums, int target, int n) {
        int s = 0;
        int e = n - 1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid] == target){
                return mid;
            }
            // Left half is sorted
            if(nums[s] <= nums[mid]){
                if(nums[s] <= target && target <= nums[mid]){
                    e = mid - 1;
                }
                else{
                    s = mid + 1;
                }
            }
            // Right Half is Sorted
            else{
                if(nums[mid] <= target && target <= nums[e]){
                    s = mid + 1;
                }
                else{
                    e = mid - 1;
                }
            }
        }
        return -1;
    }

}
