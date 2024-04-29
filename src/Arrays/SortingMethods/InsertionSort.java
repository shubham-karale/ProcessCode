package Arrays.SortingMethods;

import java.util.*;

public class InsertionSort {

    static void swap(int []arr,int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    static void insertionSortUsingForLoops(int [] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
        System.out.println("The Sorted Arrays are : " + Arrays.toString(arr) );
    }

    static void insertionSort(int[] arr){
        int n = arr.length;
//        Loops through the Unsoreted the Arrays
        for (int i = 0; i <= n-1 ; i++) {
            int j = i; // Assign the value of unsorted arrays idx to J

//            Run loop till either J becomes 0 OR prev ele is less than the current elements and Itreate the looops till the left hand side becomes sorted till the idex
            while(j>0 && arr[j-1] > arr[j] ){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        System.out.println("Insertion Sort: ");
        System.out.println("Enter the Length of an arrays ");
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        System.out.println("Enter the Arrays Elements");
        int [] arr  = new int[n];

        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Unsorted Arrays : " + Arrays.toString(arr));

        insertionSort(arr);

        insertionSortUsingForLoops(arr);

    }
}
