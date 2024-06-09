package Arrays;
import java.util.Arrays;
public class Qu17_MedianOfTwoSortedArrays_4 {
    static double findMedianSortedArrays(int [] nums1,int [] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;


        int [] merged = new int[n1+n2];
        int k = 0;

        // Add all ele of nums1 and nums2 into merged arrays
        for(int i = 0;i<n1;i++){
            merged[k++] = nums1[i];
        }
        for (int j = 0; j < n2 ; j++) {
            merged[k++] = nums2[j];
        }

        Arrays.sort(merged); // TC = O(nlogn



        // Find Median as we know that array length is odd -> then n/2 element is median
        // if array length is even -> then n/2 and n/2 + 1 element is median
        int n = merged.length;
        if(n % 2 == 0) {
            return (double) (merged[n / 2] + merged[n / 2 - 1]) / 2;
        }
            else{
                return merged[n/2];
            }


    }
    public static void main(String[] args) {
        System.out.println("Median of Two Sorted Arrays");
        int [] nums1 = {1,3};
        int [] nums2 = {2};
        int [] nums3 = {1,2};
        int [] nums4 = {3,4};
        //System.out.println(findMedianSortedArrays(nums1, nums2));
        System.out.println(findMedianSortedArrays(nums3, nums4));

    }
}
