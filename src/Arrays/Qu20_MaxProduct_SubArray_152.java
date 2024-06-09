package Arrays;

public class Qu20_MaxProduct_SubArray_152 {
    static int maxProduct(int [] nums){
        int n = nums.length;
        int max = nums[0];
       int currProd= nums[0];

        for(int i = 1;i<n;i++){
            currProd = currProd * nums[i];
            if(currProd < 1){
                currProd = nums[i];
            }
            max = Math.max(max,currProd);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Maximum Product SubArray");
        int [] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
}
