package BinarySearch;
import java.util.Arrays;

public class Qu24_FindFirstAndLastOccurence_34 {
    static int [] firstAndLastOccurence(int[] nums,int target){
        int s = 0;
        int e = nums.length-1;
        int mid;
        int[] ans = {-1,-1};
        int firstOccurence = -1;
        int lastOccurence = -1;

        // First Occurence
        while(s<=e){
            mid = s + (e-s)/2;
            if(nums[mid] == target){
                firstOccurence = mid;
                e = mid - 1;
            }
            else if(nums[mid] > target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }

        // Last Occurence
        s = 0;
        e = nums.length-1;
        while(s<=e){
            mid = s + (e-s)/2;
            if(nums[mid] == target){
                lastOccurence = mid;
                s = mid + 1;
            }
            else if(nums[mid] > target){
                e = mid - 1;
            }
            else{
                s = mid + 1;
            }
        }
        ans[0] = firstOccurence;
        ans[1] = lastOccurence;
        return ans;

    }

    public static void main(String[] args) {
        System.out.println("Find First and Last Occurence");
        int[] nums = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int target = 5;
        int[] ans = firstAndLastOccurence(nums, target);
        int nums2[] = {5, 7, 7, 8, 8, 10};
        int target2 = 8;
        int[] ans2 = firstAndLastOccurence(nums2, target2);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans2));

    }
}
