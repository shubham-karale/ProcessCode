package String;

public class Qu8_Rotate_Strings_796 {
    public static void main(String[] args) {
        System.out.println("Rotate Strings");
        String s = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(s, goal));
    }
    static boolean rotateString(String s,String goal){
        if(s.length() != goal.length()){
            return false;
        }
        String temp = s + s;
        return temp.contains(goal);
    }

}
