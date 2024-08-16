package Arrays;

public class Qu29_Find_First_Last_Position_In_Sorted_Arrays_34 {
    public static void main(String[] args) {
        System.out.println("Find First and Last Position of an Element in Sorted Arrays");
        int [] nums = {5,7,7,8,8,10};
        int n = nums.length;
        int target = 8;
        System.out.println(searchInRangeBruteForce(nums,n,target));
    }
    static int [] searchInRangeBruteForce(int [] nums,int n,int target){
         int [] ans = {-1,-1};
         int first = -1;
            int last = -1;
            for(int i = 0;i<n;i++){
                if(nums[i]== target && first == -1){
                    first = i;
                    last = i;
                }
                else if(nums[i]==target){
                    last = i;

                }
            }
            ans[0] = first;
            ans[1] = last;
            return ans;
    }
}
