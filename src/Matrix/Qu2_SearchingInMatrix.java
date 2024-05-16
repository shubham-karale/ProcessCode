package Matrix;

public class Qu2_SearchingInMatrix {
    public static void main(String[] args) {
        System.out.println("Searching In Matrix");
        int [][] nums = { { 0, 6, 8, 9, 11 },
                { 20, 22, 28, 29, 31 },
                { 36, 38, 50, 61, 63 },
                { 64, 66, 100, 122, 128 } };
        int m = nums.length;
        int n;
        for (int i = 0; i < m ; i++) {
             n = nums[i].length;
             for (int j=0;j<n;j++){
                 System.out.print(nums[i][j] + " ");
             }

            System.out.println(" ");

        }
        System.out.println(searching(nums,29));
    }
    static boolean searching(int [][] nums,int target){
         int m = nums.length;
         for(int i = 0;i<m;i++){
             int n = nums[i].length;
             for(int j=0;j<n;j++){
                 if(nums[i][j]== target){
                     return true;
                 }
             }

         }
        return false;
    }
}
