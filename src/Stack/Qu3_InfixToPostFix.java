package Stack;

import java.util.Stack;

@SuppressWarnings("t")
public class Qu3_InfixToPostFix {
    // precedence
    public static int precedence(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    // postfix conversion
    public static void postfix(String str){
        String result = "";
        // * Stack
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            // * Character
            char ch = str.charAt(i);
            // check if character is letter or digit if yes then add to the result
            if(Character.isLetterOrDigit(ch)){
                result += ch;
            }
            // * check if character is opening bracket if yes then push to the stack
            else if(ch=='('){
                stack.push(ch);
            }
            // * check if character is closing bracket if yes then pop the elements from the stack till the opening bracket
            else if(ch==')'){
                while (!stack.isEmpty() && stack.peek()!='('){
                    result += stack.pop();
                }
                // * pop the opening bracket
                stack.pop();
            }
            // * check if character is operator if yes then check the precedence of the operator
            else{
                // * if precedence of the operator is less than the precedence of the operator in the stack then pop the elements from the stack
                while (!stack.isEmpty() && precedence(ch)<=precedence(stack.peek())){
                    result += stack.pop();
                }
                stack.push(ch);
            }
        }
        // * pop the remaining elements from the stack
        while (!stack.isEmpty()){
            result += stack.pop();
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        System.out.println("Infix to Postfix Conversion");
        String str = "a+b*(c^d-e)^(f+g*h)-i";
        postfix(str);
    }
}
