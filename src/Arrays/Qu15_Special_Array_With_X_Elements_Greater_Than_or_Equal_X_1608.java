package Arrays;

public class Qu15_Special_Array_With_X_Elements_Greater_Than_or_Equal_X_1608 {
    static int specialArray(int[] nums) {
        // TC = O(n^2)
        // SC = O(1)
        for(int i = 1; i <= nums.length; i++){
            // Count the number of elements greater than or equal to i
            int count = 0;
            // Iterate through the array
            for(int j = 0; j < nums.length; j++){
                // If the element is greater than or equal to i
                if(nums[j] >= i){
                    count++;
                }
            }
            // If the count is equal to i
            if(count == i){
                return i;
            }
        }
        return -1;
    }

    // TC = O(n)
    // SC = O(n)
    static int specialArray1(int[] nums) {
        // Count the frequency of each element
        int [] freq = new int[1001];
        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
        }
        // Calculate the prefix sum
        for(int i = 1; i < freq.length; i++){
            freq[i] += freq[i-1];
        }

        // Iterate through the array
        for(int i = 1; i < freq.length; i++){
            if(freq[1000] - freq[i-1] == i){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Special Array With X Elements Greater Than or Equal X");
        int [] nums = {3,5};
        System.out.println(specialArray(nums));
        int [] nums1 = {0,0};
        System.out.println(specialArray(nums1));
        int [] nums2 = {0,4,3,0,4};
        System.out.println(specialArray(nums2));
    }
}
