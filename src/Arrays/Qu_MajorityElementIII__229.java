package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Qu_MajorityElementIII__229 {

    static List<Integer> majorityElementsUsingMap(int [] nums,int n,int k){
        int n1 = nums.length;
        int k1 = (nums.length/3);
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        // Add all the elements in the map
        for(int i = 0;i<n1;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        // Check if the value is greater than k1
        for(int i = 0;i<n1;i++){
            if(map.get(nums[i]) > k1 && list.contains(nums[i]) == false){
                list.add(nums[i]);
            }
        }

        return list;
    }

    /*
       **Algorithm**
       * 1. Create 2 variables count1 and count2 and num1 and num2
       * 2. Traverse the array and check if num1 is equal to nums[i] then increment count1
       * 3. Else if num2 is equal to nums[i] then increment count2
       * 4. Else if count1 is 0 then update num1 to nums[i] and count1 to 1
       * 5. Else if count2 is 0 then update num2 to nums[i] and count2 to 1
       * 6. Else decrement count1 and count2
       * 7. Again traverse the array and check if nums[i] is equal to num1 then increment count1
       * 8. Else if nums[i] is equal to num2 then increment count2
       * 9. If count1 is greater than k1 then add num1 to the list
       * 10. If count2 is greater than k1 then add num2 to the list
       * 11. Return the list
     */

    static List<Integer> majoriyElementIII(int [] nums,int n,int k){
        int n1 = nums.length;
        int k1 = (nums.length/3);
        ArrayList<Integer> list = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        int num1 = 0;
        int num2 = 0;
        for(int i = 0;i<n1;i++){
            if(num1 == nums[i]){
                count1++;
            }
            else if(num2 == nums[i]){
                count2++;
            }
            else if(count1 == 0){
                num1 = nums[i];
                count1 = 1;
            }
            else if(count2 == 0){
                num2 = nums[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i = 0;i<n1;i++){
            if(nums[i] == num1){
                count1++;
            }
            else if(nums[i] == num2){
                count2++;
            }
        }
        if(count1 > k1){
            list.add(num1);
        }
        if(count2 > k1){
            list.add(num2);
        }
        return list;
    }
    static List<Integer> majorityElement(int[] nums, int n, int k) {
        int n1 = nums.length;
        int k1 = (nums.length/3);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0;i<n1;i++){
            int count = 1;
            for(int j = i+1;j<n1;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > k1 && list.contains(nums[i]) == false){
                list.add(nums[i]);
            }
        }

        return list;


    }
    public static void main(String[] args) {
        System.out.println("Majority Element III");
        int [] nums = {3,2,3};
        int n = nums.length;
        int k = 3;
        int [] nums1 = {1};
        int n1 = nums1.length;
        int k1 = 3;
        int [] nums2 = {1,2};
        int n2 = nums2.length;
        int k2 = 3;
        System.out.println(majorityElement(nums,n,k));
        System.out.println(majoriyElementIII(nums,n,k));
        System.out.println(majorityElement(nums1,n1,k1));
        System.out.println(majoriyElementIII(nums1,n1,k1));

    }
}
