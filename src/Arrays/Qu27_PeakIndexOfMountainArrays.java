package Arrays;

public class Qu27_PeakIndexOfMountainArrays {
    static int peakIndexInMountainArrayStriverSolution(int [] nums){
        int n = nums.length;
        // check if only one element that means that ele is peak
        if(n==1) return 0;
        // check if first element is peak
        if(nums[0] > nums[1]) return 1;

        // check if last element is peak
        if(nums[n-1] > nums[n-2]) return n-1;

        int low = 1;
        int high = n-2;

        while(low<=high){
            int mid = low+(high-low)/2;

            // check if mid element is peak
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                return mid;
            }
            // check if mid element is less than mid+1 element
            else if(nums[mid] < nums[mid+1]){
                low = mid+1;
            }
            else {
                high = mid-1;
            }

        }

        return -1;

    }
    static int peakIndexInMountainArrayBruteForce(int [] arr){
        int max = Integer.MIN_VALUE;
        int index = -1;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    static int peakIndexInMountainArray(int [] arr){
        int s = 0;
        int e = arr.length-1;
        int mid;
        while(s<e){
            mid = s + (e-s)/2;
            if(arr[mid] > arr[mid+1]){
                e = mid;
            }
            else{
                s = mid + 1;
            }
        }
        return s;
    }

    // Rohit Negi Approach
    static int peakIndexInMountainArray1(int [] nums){
        int s = 0;
        int e = nums.length-1;
        int mid;
        while(s<e){

            mid = s + (e-s)/2;

            // Check mid elements is greater than mid+1 elements and Mid-1
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if(nums[mid] > nums[mid-1]){
                s = mid + 1;
            }
            else {
                e = mid-1;
            }


        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Peak Index of Mountain Arrays");
        int [] arr = {0,2,1,0};
        System.out.println(peakIndexInMountainArrayBruteForce(arr));
        int [] arr2 = {0,10,5,2};
        System.out.println(peakIndexInMountainArrayBruteForce(arr2));
    }
}
