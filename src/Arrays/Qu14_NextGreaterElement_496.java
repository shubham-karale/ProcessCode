package Arrays;

import java.util.ArrayList;

@SuppressWarnings("t")
public class Qu14_NextGreaterElement_496 {
    public static void main(String[] args) {
        System.out.println("Next Greater Element I");
        int [] nums1 = {4,1,2};
        int [] nums2 = {1,3,4,2};
        System.out.println(nextGreaterElement(nums1, nums2));

    }

    private static int [] nextGreaterElement(int[] nums1, int[] nums2) {
        // Create ArrayList<Integer> res to store the result...
        ArrayList<Integer> res = new ArrayList<>();
        // Iterate through the first array...
        for (int i = 0; i < nums1.length; i++) {
            int index = -1;
            // Iterate through the second array...
            for (int j = 0; j < nums2.length; j++) {
                // check if the element in the first array is present in the second array...
                if (nums1[i] == nums2[j]) {
                    // If present, store the index of the element in the second array...
                    index = j;
                    break;
                }
            }
            // If the element is not present in the second array...
            if (index == -1) {
                res.add(-1);
            } else {
                // If the element is present in the second array...
                int nextGreater = -1;
                for (int j = index + 1; j < nums2.length; j++) {
                    if (nums2[j] > nums1[i]) {
                        // Store the next greater element in the second array...
                        nextGreater = nums2[j];
                        break;
                    }
                }
                res.add(nextGreater);
            }
        }
        // Convert the ArrayList to an array and return the result...
        int [] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }
}
