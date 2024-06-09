package Arrays;
import java.util.*;

public class Qu13_SearchInsertPosition_35 {
    static int searchInsert(int[] nums, int target) {
        // TC  = O(log n)
        // SC = O(1)
        int start = 0;
        int end = nums.length - 1;
        // Binary Search
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        // If the element is not found return the start
        return start;
    }

    // Using Linear Search
    static int searchInsert1(int[] nums, int target) {
        // TC = O(n)
        // SC = O(1)
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return nums.length;
    }




    public static void main(String[] args) {
//        System.out.println("Search Insert Position");
//        int [] nums = {1,3,5,6};
//        int target = 2;
//        System.out.println(searchInsert(nums, target));
//        System.out.println(searchInsert1(nums, target));
    }
}
