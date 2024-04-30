package Arrays;

import java.util.*;

/*
  Input: a = [1, 2, 3, 2], n = 4

Output: 2 3

Explanation:
a[ 2 ] = 3 is greater than a[ 3 ]. Hence it is a Superior Element.
a[ 3 ] = 2 is the last element. Hence it is a Superior Element.
The final answer is in sorted order.


Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
4
1 2 2 1


Sample Output 1:
1 2


Explanation of Sample Input 1:
Element present at the last index is '1' and is a superior element since there are no integers to the right of it.
Element present at index 2 (0-indexed) is '2' and is greater than all the elements to the right of it.
There are no other superior elements present in the array.
Hence the final answer is [1,2].


Sample Input 2:
3
5 4 3


Sample Output 2:
3 4 5


Expected Time Complexity:
Try to solve this in O(n).


 */

public class Qu6_SuperiorElements {

    static List<Integer> superiorElements(int[] nums, int n) {
        boolean check = false;
        List<Integer> ans = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    check = true;
                    s.add(nums[i]);

                } else {
                    break;
                }
            }
            //ans.add(nums[i]);
        }

        //         As the Last Element always be the greatest as there is no next greater element than these
        s.add(nums[n - 1]);

//        Convert Set into ArrayList
        ans.addAll(s);

        //Collections.sort(ans);
        return ans ;
    }

//    Superior Elements
    /*
       ! LOGIC
         * As we know that last elements will be always superior or leader so we add last elements
         * And Traverse Looops from the Last elements to the first in that we check is ele > max if yes add into the List
         * And assign that elements into the max variable
     */
    static List<Integer> superiorElementsOptimalSolution(int[] nums,int n){
            ArrayList<Integer> ans = new ArrayList<>();
            int max = nums[n-1];
            ans.add(max);
            for (int i = n-2;i>0;i--){
                if(nums[i] > max){
                    ans.add(nums[i]);
                    max = nums[i];
                }
            }

            return ans;
    }

    public static void main(String[] args) {

        System.out.println("Superior Elements");
        int[] nums = {1, 2, 3, 2};
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {5, 4, 3};
        int n = nums.length;
        int n1 = nums1.length;
        int n2 = nums2.length;
        System.out.println(superiorElements(nums, n));
        System.out.println(superiorElements(nums1, n1));
        System.out.println(superiorElements(nums2, n2));
        System.out.println(superiorElements(nums1,n1));
        System.out.println(superiorElements(nums2,n2));

    }
}
