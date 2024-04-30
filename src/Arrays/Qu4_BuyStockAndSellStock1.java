package Arrays;

public class Qu4_BuyStockAndSellStock1 {
//       Brute Force Approach Time Complexity = O(n^2) Space Complexity = O(1)
/*    * Procedure
     * Step 1: Iterate ith Loop from 0 to n and j loop from i+1 to n
     *  Check arr[j] > arr[i] = check arr[j] - arr[i] > maxDiff
     * Return maxDiff

 */

    static int buyAndSellStocks(int [] prices,int n){

        int maxDiff = 0;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n ; j++) {
                if(prices[j] > prices[i]){
                    maxDiff = Math.max(maxDiff,prices[j]-prices[i]);
                }
            }
        }
        return maxDiff;

    }

//    ! Optimal Approach  = Time Complexity = O(n) Space Complexity = O(n)
    /*
       * Step 1 = Create Two Variables maxS and minS
       * Step 2  =  Iterate Loop and find out min with comparison with nums[i] elements
       * Step 3 = and also find out maxDiff between the nums[i]- min and max
       * Step 4 : return max elements
     */
    static int buyAndSellStocksOptimal(int [] nums,int n){
         int max = 0;
         int min = Integer.MAX_VALUE;

//         Iterate Single Loops
        for (int i = 0;i<n;i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]-min);
        }

        return max;

    }

    public static void main(String[] args) {
        System.out.println("Stock Buy And Sell 1");
        int[] nums = {5, 4, 3, 2, 1};
        int [] nums1 = {7,1,5,3,6,4};
        int n = nums.length;
        System.out.println(buyAndSellStocks(nums1,n));
        System.out.println(buyAndSellStocks(nums1,n));
    }
}
