package Arrays.CyclicSort;
import java.util.*;

public class FindDuplicateNumber {

    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 3, 2};
        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int [] arr) {
//        TODO:
//         Sort the Arrays if idx of prev == idx of next the return that ele
        Arrays.sort(arr);

        int ans = -1;

        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i] == arr[i+1]) {
               ans = arr[i];
            }
        }
        return ans;
    }

}
