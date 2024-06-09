package BinarySearch;

public class Qu28_SeachInRotatedSortedArrays_33 {

    // Brute Force Approach
    static int searchInRotatedSortedArraysBruteForce(int [] nums,int target){
        int idx = -1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                idx = i;
            }
        }
        return idx;
    }

    // Optimised Approach
    static int searchInRotatedArrays(int [] nums){
        return  0;
    }

    public static void main(String[] args) {
        System.out.println("Search in Rotated Sorted Arrays");
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(searchInRotatedSortedArraysBruteForce(nums,target));
        int [] nums1 = {4,5,6,7,0,1,2};
        int target1 = 3;
        System.out.println(searchInRotatedSortedArraysBruteForce(nums1,target1));

    }
}
