package String;
import java.util.Arrays;

public class Qu9_Longest_Common_Prefix_14 {
    public static void main(String[] args) {
        System.out.println("Longest Common Prefix");
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
    static String longestCommonPrefix(String [] str){
       // Sort the String
        Arrays.sort(str);
        int n = str.length;

     // Create Variable for the Smallest String and largest String in the Arrays
        String smStr = str[0];
        String lgStr = str[n-1];

        int idx = 0;
     // ? Run Loop
        while(idx < smStr.length() && idx < lgStr.length()){
            // ? Check the String at the idx in  smallest as well as largest and if both the String matches increment the idx else break the loop
            if(smStr.charAt(idx) == lgStr.charAt(idx)){

                idx++;
            }
            else {
                break;
            }
        }
        // return the sub string till the 0 to the idx
        return smStr.substring(0,idx);

    }
}
