package String;

public class Qu1_MinimumRotations {

    private static int minimumRotations(String str, int n) {
//        Create temp variable and assign the string with concetenated with its
        String temp = str + str;
        for (int i = 1; i <= n ; i++) {
            String ans = temp.substring(i,i+n);

            if(str.equals(ans)){
                return i;
            }

        }

        return n;
    }

    public static void main(String[] args) {
        System.out.println("");
        String str = "ccccc";
        int n = str.length();
        System.out.println(minimumRotations(str,n));
    }


}
