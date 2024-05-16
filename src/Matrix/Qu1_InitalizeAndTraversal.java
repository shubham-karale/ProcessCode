package Matrix;

public class Qu1_InitalizeAndTraversal {
    public static void main1(String[] args) {
        System.out.println("Matrix Initialization and Traversal");
        int [][] nums = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < nums.length ; i++) {
            for (int j = 0; j < nums.length ; j++) {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Matrix Intialization and Traversal");
        int[][] nums =  { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 } };
        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j< 4;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
