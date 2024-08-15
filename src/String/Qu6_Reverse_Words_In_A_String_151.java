package String;

public class Qu6_Reverse_Words_In_A_String_151 {
    public static void main(String[] args) {
        System.out.println("Reverse Words in a String");
        String str = "example   good a";
        System.out.println(reverseWords(str));
        System.out.println(reverseWordsUsingOptimalApproach(str));
    }

    static String reverseWords(String s) {
        String[] words = s.split(" ");
        // trim() removes leading and trailing spaces
        StringBuilder sb = new StringBuilder();
        int low = 0;
        int high = words.length - 1;
        while (low <= high) {
            String temp = words[low];
            words[low] = words[high];
            words[high] = temp;
            low++;
            high--;
        }
        for (String word : words) {
            if(!word.equals(""))
            sb.append(word + " ");
        }
        return sb.toString().trim();
    }

    static String reverseWordsUsingOptimalApproach(String str){
        String [] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            if(!words[i].equals("")){
                sb.append(words[i]+" ");
            }
        }
        return sb.toString().trim();
    }


}
