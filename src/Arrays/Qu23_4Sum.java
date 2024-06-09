package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SuppressWarnings("t")
public class Qu23_4Sum {
    public static void main(String[] args) {
        System.out.println("4 Sum");
        int [] nums = {1,0,-1,0,-2,2};
        int target = 0;
        int [] nums1 = {2,2,2,2,2};
        int target1 = 8;
        System.out.println(fourSum(nums,nums.length,target));
        System.out.println(fourSum(nums1,nums1.length,target1));
    }

    private static List<List<Integer>> fourSum(int[] nums, int n, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        if(n < 4){
            return ans;
        }

        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n ; j++) {
                for(int k = j+1 ; k < n ; k++){
                    for(int l = k+1 ; l < n ; l++){
                        if(nums[i] + nums[j] + nums[k] + nums[l] == target){
                            ArrayList<Integer> quad = new ArrayList<>();
                            quad.add(nums[i]);
                            quad.add(nums[j]);
                            quad.add(nums[k]);
                            quad.add(nums[l]);
                            if(!set.contains(quad)){
                                set.add(quad);
                                ans.add(quad);
                            }
                        }
                    }
                }
            }
        }
        return ans;




    }
}
