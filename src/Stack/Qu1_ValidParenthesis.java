package Stack;
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false

 */

/*
  * Initialize an empty stack.

* Traverse the input string character by character.

* If the current character is an opening bracket (i.e., '(', '{', '['), push it onto the stack.

* If the current character is a closing bracket (i.e., ')', '}', ']'), check if the stack is empty. If it is empty, return false, because the closing bracket does not have a corresponding opening bracket. Otherwise, pop the top element from the stack and check if it matches the current closing bracket. If it does not match, return false, because the brackets are not valid.

* After traversing the entire input string, if the stack is empty, return true, because all opening brackets have been matched with their corresponding closing brackets. Otherwise, return false, because some opening brackets have not been matched with their corresponding closing brackets.
 */

import java.util.Stack;

@SuppressWarnings("t")
public class Qu1_ValidParenthesis {
    public static void main(String[] args) {
        System.out.println("Valid Parenthesis");
        String str = "()";
        String str1 = "()[]{}";
        String str2 = "(]";
        System.out.println(validParenthesis(str));
    }

    @SuppressWarnings("t")
    private static boolean validParenthesis(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                stack.push(str.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
               char top = stack.peek();
                if(str.charAt(i)==')' && top=='(' || str.charAt(i)=='}' && top=='{' || str.charAt(i)==']' && top=='[') {
                    stack.pop();
                }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

//    ! Time Complexity: O(n), where n is the length of the input string.
//     Method 2
public boolean isValid(String s) {
    //  *Create an empty stack to keep track of opening brackets
    Stack<Character> stack = new Stack<Character>();

    // * Loop through every character in the string
    for (char c : s.toCharArray()) {
        // * If the character is an opening bracket, push it onto the stack
        if (c == '(' || c == '[' || c == '{') {
            stack.push(c);
        } else { // * If the character is a closing bracket
            // If the stack is empty, there is no matching opening bracket, so return false
            if (stack.isEmpty()) {
                return false;
            }
            // Otherwise, get the top of the stack and check if it's the matching opening bracket
            char top = stack.peek();
            if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                // If it is, pop the opening bracket from the stack
                stack.pop();
            } else { // Otherwise, the brackets don't match, so return false
                return false;
            }
        }
    }
    // If the stack is empty, all opening brackets have been closed, so return true
    // Otherwise, there are unmatched opening brackets, so return false
    return stack.isEmpty();
}

// ! Time Complexity: O(n), where n is the length of the input string.
// ! Space Complexity: O(n), where n is the length of the input string.

//    ! Method 3
public static boolean isValidParenthesis(String s) {
    while (true) {
        if (s.contains("()")) {
            s = s.replace("()", "");
        } else if (s.contains("{}")) {
            s = s.replace("{}", "");
        } else if (s.contains("[]")) {
            s = s.replace("[]", "");
        } else {
            // If the string becomes empty, it indicates all brackets are matched.
            return s.isEmpty();
        }
    }
}
//   ! Time Complexity: O(n^2), where n is the length of the input string.

}
