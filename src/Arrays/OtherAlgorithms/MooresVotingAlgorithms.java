package Arrays.OtherAlgorithms;
/*
 Moores Voting Algorithms
    Given an array of size n, find the majority element. The majority element is the element that appears more than n/2 times.
    You may assume that the array is non-empty and the majority element always exist in the array.
    Example 1:
    Input: [3,2,3]
    Output: 3
    Example 2:
    Input: [2,2,1,1,1,2,2]
    Output: 2
    What is Moores Voting Algorithm ?
    Ans = Moores Voting Algorithm is an algorithm to find the majority element in an array.
      It is a very efficient algorithm with a time complexity of O(n).
      Steps :
      Step1 : Create variable element which points to -1
      Step2 : Create a variable count which points to 0
      Step3 : Traverse the array and check if the count is 0 then update the el to the current element
      Step4 : If the candidate is equal to the current element then increment the count
      Step5 : Else decrement the count
      Step6 : Return the candidate

 */



public class MooresVotingAlgorithms {
     static int majorityElement(int [] nums,int n){
//         Assign the Element to -1
        int el = -1;
//        Assign the count to 0
        int count = 0;
        for (int i = 0; i < n; i++) {
            // If the count is 0 then update the el to the current element
            if(count==0){
                el = nums[i];
            }
            // If the candidate is equal to the current element then increment the count
            if(el==nums[i]){
                count++;
            }
            // Else decrement the count
            else {
                count--;
            }
        }
        return el;
    }
    public static void main(String[] args) {
        System.out.println("Moores Voting Algorithm");
        int [] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums,nums.length));
    }
}
