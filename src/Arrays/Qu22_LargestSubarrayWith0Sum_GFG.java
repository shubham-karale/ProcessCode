package Arrays;

public class Qu22_LargestSubarrayWith0Sum_GFG {

    static int largestSubarrayWith0SumBruteForce(int [] nums,int n) {
//        int maxLen = 0;
//        for(int i = 0;i<n;i++){
//            int currSum = 0;
//            for(int j = i;j<n;j++){
//                currSum += nums[j];
//                if(currSum == 0){
//                    maxLen = Math.max(maxLen,j-i+1);
//                }
//            }
//        }
//        return maxLen;

        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int currSum = 0;
            for (int j = i; j < nums.length; j++) {
                currSum += nums[j];
                if (currSum == 0) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }

        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println("Largest Subarray With 0 Sum");
        int [] nums = {15,-2,2,-8,1,7,10,23};
        System.out.println(largestSubarrayWith0SumBruteForce(nums,nums.length));
    }
}
