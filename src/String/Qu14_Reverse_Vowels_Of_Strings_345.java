package String;

public class Qu14_Reverse_Vowels_Of_Strings_345 {
    public static void main(String[] args) {
        System.out.println("Reverse Vowels of Strings");
        String str = "hello";
        System.out.println(reverseVowels(str));
    }

    static String reverseVowels(String str){
        // Convert string to char array
        char[] word = str.toCharArray();
        int s = 0;
        int e = str.length() - 1;
        // Vowels String
        String vowels = "aeiouAEIOU";
        while(s < e){
            // Check if the character at s is not a vowel
            while(s < e && vowels.indexOf(word[s]) == -1){
                s++;
            }
    //       Check if the character at e is not a vowel
            while(s < e && vowels.indexOf(e) == -1){
                e--;
            }
    //     Swap the characters
            char temp = word[s];
            word[s] =  word[e];
            word[e] = temp;

            s++;
            e--;

        }
        // Convert char array to string
        String ans = new String(word);
        return ans;
    }

    static String reverseVowels1(String str){
        String ans = "";
        char [] words = str.toCharArray();
        int s = 0;
        int e = str.length()-1;

        while( s < e){
            if(isVowel(words[s]) && isVowel(words[e])){
                char temp = words[s];
                words[s] = words[e];
                words[e] = temp;
                s++;
                e--;
            }
            else if(isVowel(words[s])){
                e--;
            }
            else{
                s++;
            }
        }
        ans = new String(words);
        return ans;

    }

    static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }


}
