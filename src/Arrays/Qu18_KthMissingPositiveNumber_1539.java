package Arrays;

public class Qu18_KthMissingPositiveNumber_1539 {
    static int findKthPositive(int [] nums, int k){
        // Brute Force
        int i = 1;
        int j = 0;
        int count = 0;
        while(count < nums.length){
            if(i == nums[j]){
                i++;
                j++;
            }
            else{
                i++;
                count++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        System.out.println("Kth Missing Positive Number");
        int [] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(findKthPositive(arr,k)); // 9
    }
}
