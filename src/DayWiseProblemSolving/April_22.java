package DayWiseProblemSolving;
// Longest Subarray With Sum K.
public class April_22 {
    public static void main(String[] args) {
        System.out.println("Enter the Arrays Elements");
        int [] nums = {1, 2, 1, 0, 1};
        int n = nums.length;
        int k = 4;
        System.out.println(LongestSubArrays(nums,n,k));
    }
    static int LongestSubArrays(int [] nums,int n,int k) {
        int len = 0;
        for (int i = 0; i < n; i++) {
            int s = 0;
            for (int j = 0; j < n ; j++) {
                    s = s + nums[j];
                    if(s==k){
                        len = Math.max(len,j-i+1);
            }
        }

    }
        return len;
    }
}
