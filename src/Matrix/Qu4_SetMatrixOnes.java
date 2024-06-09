package Matrix;
/*
    Question: Given a m x n matrix. If an element is 0, set its entire row and column to 0. Do it in-place.
    Example 1:
    Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
    Output: [[1,0,1],[0,0,0],[1,0,1]]

    Example 2:
    Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
    Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]


 */

@SuppressWarnings("ALL")
public class Qu4_SetMatrixOnes {

public static void markRowAsZero(int [][] matrix,int row){
        for (int i = 0; i < matrix[row].length; i++) {
            matrix[row][i] = -1;
        }
    }

    // Marks Cols as Zero
    public static void markColAsZero(int [][] matrix,int col){
    for (int i = 0; i < matrix.length; i++) {
            matrix[i][col] = -1;
        }
    }

    static void setMatrixZeros(int [][] matrix){
        //Find 0 and mark it's rows and cols as -1
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n ; i++) {
            m = matrix[i].length;
            for (int j = 0; j < m ; j++) {
                if(matrix[i][j]==0){
                    markRowAsZero(matrix,i);
                    markColAsZero(matrix,j);
                }
            }
        }

        // After Mark -1 as 0
        for (int i = 0; i < n ; i++) {
            m = matrix[i].length;
            for (int j = 0; j < m ; j++) {
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n ; i++) {
            m = matrix[i].length;
            for (int j = 0; j < m ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        System.out.println("Set Matrix Zeros");
        int [][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setMatrixZeros(matrix);
    }
}
