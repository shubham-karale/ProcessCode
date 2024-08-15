package Leetcode;

public class Find_Missing_Positive_41 {
    public static void main(String[] args) {
        System.out.println("Find Missing Positive");
        int[] nums = {1, 2, 0};
        int n = nums.length;
        System.out.println(findMissingPositiveBruteForce(nums, n));
    }

    static int findMissingPositiveBruteForce(int[] nums, int n) {
        int ans = 1;
//        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (nums[i] == ans) {
                ans++;
            }

        }
        return ans;
    }

    // Using Boolean Array
    static int findMissingPositiveNumberUsingBooleanArrays(int [] nums,int n){
        Boolean [] seen = new Boolean[n+1];
        for(int i=0;i<n;i++){
            if(nums[i]>0 && nums[i]<=n){
                seen[nums[i]] = true;
            }
        }
        for(int i=1;i<=n;i++){
            if(seen[i]==null){
                return i;
            }
        }
        return n+1;
    }
}

