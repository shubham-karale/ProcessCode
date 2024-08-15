package String;

public class Qu5_RemoveOuterMostParenthesis {
    public static void main(String[] args) {
        System.out.println("Remove OuterMost Parenthesis");
        String str = "(()())(())";
        System.out.println(removeParenthesis(str));
    }
    static String removeParenthesis(String str) {
        // using Brute Force Approach
        char [] ch = str.toCharArray();
        String res = "";
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for(char c : ch){
            if(c == '('){
                if(count > 0){
                    sb.append(c);
                }
                count++;
            }
            else{
                count--;
                if(count > 0){
                    sb.append(c);
                }
            }
        }
        return res.toString();
    }

}
