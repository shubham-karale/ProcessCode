package BinarySearch;

public class NthRootOfM {
    static int findNthRoot(int n,int m){
        int ans = -1;
        int s = 1;
        int e = m;
        // ! Assign start as 1 and end ans m which is given
        while(s<=e){
            int mid = s + (e-s)/2;
            // * If Math.pow(mid,n) == m return mid and break
            if(Math.pow(mid,n) == m){
                ans = mid;
            }
            else if(Math.pow(mid,n) < m){
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return ans;
    }
    static int findNthRootBruteForce(int n,int m){
        int ans = -1;
      for(int i=1;i<=m;i++){
          if(Math.pow(i,n)==m){
              ans = i;
              break;
          }
      }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Nth Root of M");
        int n = 2;
        int m = 16;
        System.out.println(findNthRootBruteForce(n, m));
        System.out.println(findNthRoot(n,m));
    }
}
