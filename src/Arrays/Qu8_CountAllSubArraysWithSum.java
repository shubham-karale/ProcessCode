package Arrays;

public class Qu8_CountAllSubArraysWithSum {
//    Function for countSubArraysWithSum
    static int countSubArraysWithSumBruteForce(int[] nums,int n,int target){
            int cnt = 1;
        for (int i = 0; i < n ; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k < j ; k++) {
                    sum += nums[k];

//                    Calculate the Sum
                    if(sum== target ){
                        cnt++;
                    }
                }


            }
        }

        return cnt;

    }

//    Brute Force O(n2) SC = O(1)
    static int countSubArraysSumBruteForce2(int [] nums,int n,int target){
        int cnt = 0;
        for (int i = 0; i < n ; i++) {
            int sum = 0;
            for (int j = i; j < n ; j++) {
                sum += nums[j];
                if(sum==target){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    // Optimised Approach
    // TC = O(n)
    // SC = O(n)
    static int countSubArraysSumOptimised(int [] nums,int n,int target){
        int cnt = 0;
        int sum = 0;
        int [] prefixSum = new int[n];
        for (int i = 0; i < n ; i++) {
            sum += nums[i];
            prefixSum[i] = sum;
        }
        for (int i = 0; i < n ; i++) {
            for (int j = i; j < n ; j++) {
                int subArraySum = prefixSum[j] - (i > 0 ? prefixSum[i-1] : 0);
                if(subArraySum == target){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println("Count All SubArrays with Sum");
        int [] nums = {3, 1, 2, 4};
        int n = nums.length;
        int target = 6;
        int [] nums1  = {1,2,3};
        int n1 = nums1.length;
        int target1 = 3;
        System.out.println(countSubArraysWithSumBruteForce(nums,n,target));
        System.out.println(countSubArraysWithSumBruteForce(nums1,n1,target1));
        System.out.println(countSubArraysSumBruteForce2(nums,n,target));
        System.out.println(countSubArraysSumBruteForce2(nums,n,target));
    }
}
