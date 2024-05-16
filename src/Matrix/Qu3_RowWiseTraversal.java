package Matrix;

public class Qu3_RowWiseTraversal {
    public static void main(String[] args) {
        System.out.println("Row-wise Traversal");
        int [][] nums = { { 0, 6, 8, 9, 11 },
                { 20, 22, 28, 29, 31 },
                { 36, 38, 50, 61, 63 },
                { 64, 66, 100, 122, 128 } };
//        Row wise Traversal
        for(int i = 0;i<nums.length;i++){
            int n = nums[i].length;
            for (int j = 0; j < n ; j++) {
                System.out.print(nums[i][j] + " ");
            }


        }
//        Col-wise Traversal
        System.out.println(" ");
        //        Col wise Traversal
        for(int i = 0;i<nums[0].length;i++){
            //        Row wise Traversal
            for (int j = 0; j < nums.length ; j++) {
                System.out.print(nums[j][i] + " ");
            }
            System.out.println(" ");
        }

    }
}
