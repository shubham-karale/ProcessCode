package Arrays;
//Maximum Sub Arrays Sum
public class Qu2_MaximumSubArraysSum {

//    Brute Force  = O(n3)  = Space complexity
    static int maxSubArraysSum(int[] nums,int n){
        int maxSum = 0;
         for(int i = 0;i< n;i++){
             for(int j = i;j<n;j++){
                 int sum = 0;
                 for(int k = i;k<=j;k++){
                     sum += nums[k];
                 }

                 maxSum = Math.max(maxSum,sum);
             }
         }
         return maxSum;
    }

//    Brute force Optimised
    static int maxSubArraysSumBruteOpti(int[] nums,int n){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            int sum = 0;
            for(int j = i;j<n;j++){
                sum += nums[j];
            }
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }

//    Kadane's Algorithm
    static int maxSubArraysSumKadane(int[] nums,int n){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum += nums[i];
            if(sum < 0){
                sum = 0;
            }
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("Maximum Subarrays Sum");
        int [] nums = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSubArraysSum(nums,nums.length));

        System.out.println(maxSubArraysSumBruteOpti(nums, nums.length));
        System.out.println(maxSubArraysSumKadane(nums, nums.length));


    }
}
