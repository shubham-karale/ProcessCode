package Arrays.OtherAlgorithms;

public class PrefixSumAndSuffixSum {
    public static void main(String[] args) {
        System.out.println("Prefix Sum and Suffix Sum");
        int [] nums = {10, 20, 10, 5, 15};
        System.out.println(prefixSum(nums));
        System.out.println(suffixSum(nums));
    }
    static int prefixSum(int [] nums){
        int prefix= nums[0];
        for(int i =1 ; i< nums.length;i++){
            prefix += nums[i];
        }

        return prefix;
    }

    // Suffix Sum
    static int suffixSum(int[] nums){
        int suffix = nums[nums.length-1];
        for(int i = nums.length-2;i>=0;i--){
            suffix += nums[i];
        }
        return suffix;
    }
}
