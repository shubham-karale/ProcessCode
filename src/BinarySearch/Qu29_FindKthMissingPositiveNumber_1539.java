package BinarySearch;

public class Qu29_FindKthMissingPositiveNumber_1539 {
    static int findKthPositiveBruteForce(int [] nums,int k){
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=k){
                k++;
            }
            break;
        }
        return k;
    }
    public static void main(String[] args) {
        System.out.println("Kth Missing Positive Number");
        int arr[] = {2, 3, 4, 7, 11};
        int k = 5;
        System.out.println(findKthPositiveBruteForce(arr, k));
        int arr2[] = {1, 2, 3, 4};
        int k2 = 2;
        System.out.println(findKthPositiveBruteForce(arr2, k2));
        int arr3[] = {2, 3, 4, 7, 11};
        int k3 = 5;
        System.out.println(findKthPositiveBruteForce(arr3, k3));
    }
}
