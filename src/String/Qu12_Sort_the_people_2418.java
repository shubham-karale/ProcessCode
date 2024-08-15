package String;

import java.util.Arrays;

public class Qu12_Sort_the_people_2418 {
    public static void main(String[] args) {
        System.out.println("Sort the People");
        String [] names = {"John","Bob","Christina","Ema","Alice"};
        int [] heights = {5,6,7,8,9};
        System.out.println(sortPeople(names,heights));
        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }
    static String [] sortPeople(String [] names,int [] heights){
        int namesLength = names.length;
        int heightsLength = heights.length;
        // test Case 1 -> check the length of the arrays are equal or not if not equal return empty arrays
        if(namesLength != heightsLength){

        }
       Arrays.sort(names);


        return names;
    }
    // Generic Swap Functions

    static <T> void swap(T a,T b){
        T temp = a;
        a = b;
        b = temp;
    }
}
