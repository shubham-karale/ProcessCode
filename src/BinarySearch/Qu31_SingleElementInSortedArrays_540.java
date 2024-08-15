package BinarySearch;

public class Qu31_SingleElementInSortedArrays_540 {

    /*
      * CONCEPT OF XOR
      * 1. XOR of a number with itself is 0.
      * 2. XOR of a number with 0 is the number itself.

      ! LOGIC
      * As we know that the array is sorted and the elements are repeated twice except for one element
      * So we can use the XOR operation to find the single element
     */
    static int singleElementBruteForce(int [] nums){
        // using xor method
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }
    static int singleElement(int [] nums){
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(mid % 2 == 1){
                mid--;
            }
            if(nums[mid] == nums[mid + 1]){
                left = mid + 2;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        System.out.println("Single Element in Sorted Arrays");
        int [] nums = {1,1,2,3,3,4,4,8,8};
        int [] nums1 = {3,3,7,7,10,11,11};
        int [] nums2 = {1,1,2};
        System.out.println(singleElementBruteForce(nums));
    }
}
