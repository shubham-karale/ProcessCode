package BinarySearch;

public class Qu26_SqrtOfX_69 {
    static int sqrtSelfDesignMethd(int target){
        int s = 0;
        int e = target;
        int mid = -1;
        while(s<=e){
            mid = s+(e-s)/2;
            if(mid*mid==target){
                return mid;
            }
            else if(mid*mid<target){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return mid;
    }
    static int sqrtBruteForce(int x){
        if(x==0 || x==1){
            return x;
        }
        int i = 1;
        int result = 1;
        while(result<=x){
            i++;
            result = i*i;
        }
        return i-1;
    }

    // Optimised Approach
    static int sqrtOptimised(int x){
        if(x==0 || x==1){
            return x;
        }
        int s = 1;
        int e = x;
        int ans = 0;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(mid == x/mid){
                return mid;
            }
            else if(mid < x/mid){
                s = mid + 1;
                ans = mid;
            }
            else{
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println("Square Root of X");
        int x = 8;
        System.out.println(sqrtBruteForce(x));
        System.out.println(sqrtOptimised(x));
        System.out.println(sqrtSelfDesignMethd(x));
        System.out.println(sqrtSelfDesignMethd(100));
        System.out.println(sqrtSelfDesignMethd(144));
        System.out.println(sqrtSelfDesignMethd(6400));
    }
}
