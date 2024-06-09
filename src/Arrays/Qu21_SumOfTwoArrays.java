package Arrays;

import java.util.Arrays;

public class Qu21_SumOfTwoArrays {
    public static void main(String[] args) {
        System.out.println("Sum of Two Arrays");
        int [] arr1 = {9,9,9,9,9,9,9};
        int [] arr2 = {9,9,9,9};
        int [] res = sumOfTwoArrays(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }

    private static int[] sumOfTwoArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        String s1 = "";
        String s2 = "";

        for (int i = 0; i < nums1.length ; i++) {
            s1 += nums1[i];
        }

        for (int i = 0; i < nums2.length ; i++) {
            s2 += nums2[i];
        }

        int num1 = Integer.parseInt(s1);
        int num2 = Integer.parseInt(s2);

        int sum = num1 + num2;
        String s = Integer.toString(sum);
        int [] res = new int[s.length()];
        for (int i = 0; i < s.length() ; i++) {
            res[i] = s.charAt(i) - '0';
        }

        return res;
        

    }
}
