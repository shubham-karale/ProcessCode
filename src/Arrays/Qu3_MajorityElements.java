package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.*;



public class Qu3_MajorityElements {
//      Brute Force = O(n2)
    static int majorityElementBruteForce(int[]nums, int n){
        int cnt = 0;
        int ans = -1;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            if(cnt > n/2){
                ans = nums[i];
            }
        }
        return ans;
    }
//  Using HashMap Space Complexity = O(n) Time Complexity = O(n)
    static int majorityElement(int [] nums,int n){
//        Create HashMap
        HashMap<Integer,Integer> mp = new HashMap<>();
//        Put Elements into the Map
        for (int i = 0; i < n; i++) {
            // Capture the value and Put into the Maps
            int val = mp.getOrDefault(nums[i],0);
            mp.put(nums[i],val+1);
        }
//      Iterate Over the Map
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;

    }

//     Using Sort and Return the Middle Elements
    static int majorityElementsUsingSort(int[] nums,int n){
//        Sort the Arrays
        Arrays.sort(nums);
        int idx = n/2;
        return nums[idx];

    }

//    Most Optimal Solution  = Moores Voting Algorithm
static int majorityElementOptimalSolution(int [] nums,int n){
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

        System.out.println("Majority Elements");
        int [] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElementBruteForce(nums,nums.length));
        System.out.println(majorityElement(nums,nums.length));
        System.out.println(majorityElementsUsingSort(nums,nums.length));
        System.out.println(majorityElementOptimalSolution(nums,nums.length));
    }
}
