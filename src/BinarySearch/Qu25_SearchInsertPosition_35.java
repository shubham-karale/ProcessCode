package BinarySearch;

public class Qu25_SearchInsertPosition_35 {
    static int searchInsertPositionBruteForce(int[] nums,int target){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if(nums[i] == target){
                return i;
            }
            else if(nums[i] > target){
                return i;
            }
        }
        return n;
    }

    // Birary Search By Rohit Negi Approach
    static int searchInsertPosition1(int [] nums,int target){
        int s = 0;
        int e = nums.length-1;
        int idx = nums.length;
        int mid;
        while(s<=e){
            mid = s + (e-s)/2;
            if(nums[mid]==target){
                idx = mid;
            }
            else if(nums[mid]< target){
                s = mid + 1;
            }
            else{
                idx = mid;
                e = mid - 1;
            }
        }
        return idx;
    }

//    Binary Search Optimised
    static int searchInsertPosition(int [] nums,int target){
        int s = 0;
        int e = nums.length-1;
        int mid;
        while(s<=e){
            mid = s + (e-s)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println("Search Insert Position");
        int [] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsertPosition(nums,target));
        int [] nums2 = {1,3,5,6};
        int target2 = 2;
        System.out.println(searchInsertPosition(nums2,target2));
    }
}
