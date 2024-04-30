package Arrays;

/*
     [55,10,29,74]
The subarrays of this array would be

55
55 10
55 10 29
55 10 29 74
10
10 29
10 29 74
29
29 74
7
 */
public class FindAllSubArrays {
    static void printAllSubArrays(int[]nums,int n){
        // Create 3 Loops first for ith and jth loop from i to n and k from i to j
        for (int i = 0; i < n; i++) {
            for (int j = i; j <=n ; j++) {
                for (int k = i; k <j ; k++) {
                    System.out.print(nums[k] + " ");
                }
                System.out.println("");
            }
                System.out.println("");


        }
    }

//    Prints SubArrays with Recursion
    static void printAllSubArraysWithRecursion(int [] nums,int n,int head,int tail){

        if(tail == n){
            return;
        }
        else if(head > tail){
            printAllSubArraysWithRecursion(nums,n,0,tail+1);
        }
        else {
            System.out.print(nums[head] + " ");
            printAllSubArraysWithRecursion(nums,n,head+1,tail);
        }

    }


    public static void main(String[] args) {
        System.out.println("Prints All SubArrays");
        int [] nums = {55,10,29,74};
        int n = nums.length;
        printAllSubArrays(nums,n);
        printAllSubArraysWithRecursion(nums,n,0,n-1);
    }
}
