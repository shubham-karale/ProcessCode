package Arrays.SortingMethods;

// What is Dutch Flag Algorithms
//   Dutch National Flag problem is a problem in computer science in which elements of an array are arranged in three groups that are:
//   1. 0s
//   2. 1s
//   3. 2s
// Dutch National Flag Problem is based on Three Pointers Approach
//   1. Low Pointer
//   2. Mid Pointer
//   3. High Pointer
// The Dutch National Flag problem is a problem in which we have to sort an array of 0, 1, and 2 in linear time and constant space.
 /*
   Example:
    Input: [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]
     Create low pointer and mid pointer at 0th idx
        Create high pointer at last idx
        Run loop till mid <= high
        if arr[mid] == 0 then swap arr[mid] and arr[low] and increment low and mid
        if arr[mid] == 1 then increment mid
        if arr[mid] == 2 then swap arr[mid] and arr[high] and decrement high
  */

public class DutchFlagAlgorithms {
    public static void main(String[] args) {
        System.out.println("Dutch National Flag Problem");
        int [] arr = {2,0,2,1,1,0};
        int n = arr.length;
        dutchNationalFlag(arr,n);
    }

    private static void dutchNationalFlag(int[] arr, int n) {
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(arr[mid]<=high){
            if(arr[mid]==0){
//                Swap Method
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else {
                swap(arr,mid,high);
                high--;
            }
        }
    }
//    Swap Method
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
