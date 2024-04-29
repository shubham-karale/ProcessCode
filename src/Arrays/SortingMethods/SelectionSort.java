package Arrays.SortingMethods;

import java.util.*;

//NOTE:
/*
    1) Find the last idx of unsorted arrays
    2) Find the max ele idx
    3) swap the max elem idx with lastIdx of unsorted arrays

 */

public class SelectionSort {

//    find the max elements Index
    static int maxIdx(int [] arr,int s,int e){
        int max = s;
        for (int i = s;i<= e;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int [] arr,int s,int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    static void selection(int [] arr) {
//        find last idx
        for (int i = 0; i <arr.length; i++) {
            int lastIdx = arr.length - i -1;
            int maxIdx = maxIdx(arr,0,lastIdx);
            swap(arr,maxIdx,lastIdx);


        }

        System.out.println("Sorted Arrays :" + Arrays.toString(arr));


    }
    public static void main(String[] args) {
        System.out.println("Enter the Value of N");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        Enter the Arrays Elements
        int [] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Arrays :" + Arrays.toString(arr) );

        selection(arr);


    }
}
