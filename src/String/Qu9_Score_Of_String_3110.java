package String;

public class Qu9_Score_Of_String_3110 {
    public static void main(String[] args) {
        System.out.println("Score of String");
        String str = "hello";
        System.out.println(scoreOfString(str));

    }
    static int scoreOfString(String str){
        int score = 0;
        for(int i = 0;i<str.length()-1;i++){
            score += Math.abs(str.charAt(i) - str.charAt(
                    i+1)
            );
        }
        return score;
    }

}
