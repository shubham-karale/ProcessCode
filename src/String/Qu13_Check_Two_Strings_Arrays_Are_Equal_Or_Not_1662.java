package String;

public class Qu13_Check_Two_Strings_Arrays_Are_Equal_Or_Not_1662 {
    public static void main(String[] args) {
        System.out.println("Check if Two Strings Arrays are Equal Or Not");
        String [] word1 = {"ab", "c"};
        String [] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
    static boolean arrayStringsAreEqual(String [] word1, String [] word2){
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String s:word1){
            sb1.append(s);
        }
        for(String s:word2){
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }
}
