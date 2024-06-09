package Arrays;

public class Qu26_PrintMisssingPositiveNumber {
    static int [] missingPositiveNumber(int [] nums){
      return null;
    }
    public static void main(String[] args) {
        System.out.println("Print Missing Positive Number");
        int[] arr = {2,3,4,7,11};
      int [] ans = missingPositiveNumber(arr);
        for (int i = 0; i < ans.length ; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
