package Arrays;

public class LongestSubArraysWithGivenSum {
      static int longestSubArraysGivenSum(int [] nums,int target,int n){
          int len = 0;
          for (int i = 0; i < n ; i++) {
              int sum = 0;
              for(int j = i;j<n;j++){
                  sum += nums[j];
                  if(sum==target){
                      len = Math.max(len,j-i+1);
                  }
              }
          }
          return len;
      }
    public static void main(String[] args) {
        System.out.println("Longest Sub Arrays with Given Sum");
        int [] nums = {2,3,5,1,9};
        int n = nums.length;
        int target = 10;
        int [] nums1 = {2,1,3};
        int n1 = nums1.length;
        int target1 = 3;
        System.out.println(longestSubArraysGivenSum(nums,target,n));
        System.out.println(longestSubArraysGivenSum(nums1,target1,n1));
    }
}
