package Arrays.OtherAlgorithms;

/*
  Kdane's Algorithm
    Given an array of integers, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
    A subarray is a contiguous part of an array.
    Example 1:
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6.
    Example 2:
    Input: nums = [1]
    Output: 1

  What is Kdane's Algorithm ?
  Ans = Kdane's Algorithm is an algorithm to find the maximum subarray sum in an array.
    It is a very efficient algorithm with a time complexity of O(n).
    Steps :
    Step1 : Create maxSum variable which points to the -infinity
    Step2 : Create a variable sum which points to 0
    Step3 : Traverse the array and add the current element to the sum
    Step4 : If the sum is greater than the maxSum then update the maxSum
    Step5 : If the sum is less than 0 then update the sum to 0

 */

public class KdanesAlgorithms {
    static int kdanesAlgorithm(int [] nums){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            maxSum = Math.max(maxSum,sum);
            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        System.out.println("Kdane's Algorithm");
        int [] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(kdanesAlgorithm(nums));

    }
}
