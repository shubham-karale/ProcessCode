package Arrays;

public class Qu24_TrappingRainWater_42 {
    static  int trappingRainWater(int [] nums,int n){
        int res = 0;
        int [] left = new int[n];
        int [] right = new int[n];
        left[0] = nums[0];
        for (int i = 1; i < n ; i++) {
            left[i] = Math.max(left[i-1],nums[i]);
        }
        right[n-1] = nums[n-1];
        for (int i = n-2; i >=0 ; i--) {
            right[i] = Math.max(right[i+1],nums[i]);
        }
        for (int i = 1; i < n-1 ; i++) {
            res += Math.min(left[i],right[i]) - nums[i];
        }
        return res;
    }
    static int trappingRainWaterBruteForce(int [] nums,int n){
        int res = 0;
        //Iterating over the array
        for (int i = 1; i < n-1 ; i++) {
            //Finding the left max
            int leftMax = nums[i];
            for (int j = 0; j < i ; j++) {
                leftMax = Math.max(leftMax,nums[j]);
            }
            //Finding the right max
            int rightMax = nums[i];
            for (int j = i+1; j < n ; j++) {
                rightMax = Math.max(rightMax,nums[j]);
            }
            //Calculating the water trapped
            res += Math.min(leftMax,rightMax) - nums[i];
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Trapping Rain Water");
        int [] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = nums.length;
        System.out.println(trappingRainWater(nums,n));
        int [] nums2  = {4,2,0,3,2,5};
        int n2 = nums2.length;
        System.out.println(trappingRainWater(nums2,n2));
        int [] nums3 = {3,0,0,2,0,4};
        int n3 = nums3.length;
        System.out.println(trappingRainWater(nums3,n3));
    }
}
