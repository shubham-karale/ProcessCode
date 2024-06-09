package Stack;

import java.util.Stack;

@SuppressWarnings("t")
public class Qu5_InfixToPrefix {
    public static void main(String[] args) {
        System.out.println("Infix to Prefix");
        String infix = "9-(5+3)*4/6";
        infixToPrefix(infix);

    }
    // Precedence
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

    private static void infixToPrefix(String infix) {
        // Create  two Stack one for Values and one for Operators
        Stack<Character> operators = new Stack<>();
        Stack<String> values = new Stack<>();
        // Iterate through the infix expression
        for (int i = 0; i < infix.length() ; i++) {
            char ch = infix.charAt(i);
            int ascii = (int)ch;
            // If the character is an opening bracket, push it onto the stack
            if(ascii>=65 && ascii<=90 || ascii>=97 && ascii<=122 || ascii>=48 && ascii<=57){
                values.push(ch+"");
            }
            // * If the character is an opening bracket, push it onto the stack
            else if(ch=='('){
                operators.push(ch);
            }
            // * If the character is a closing bracket, pop the elements from the stack till the opening bracket
            else if(ch==')'){
                while (!operators.isEmpty() && operators.peek()!='('){
                    String val2 = values.pop();
                    String val1 = values.pop();
                    char op = operators.pop();
                    values.push(op+val1+val2);
                }
                // * pop the opening bracket
                operators.pop();
            }
            // * If the character is an operator, check the precedence of the operator
            else{
                while (!operators.isEmpty() && precedence(ch)<=precedence(operators.peek())){
                    String val2 = values.pop();
                    String val1 = values.pop();
                    char op = operators.pop();
                    values.push(op+val1+val2);
                }
                operators.push(ch);
            }
        }
        // * pop the remaining elements from the stack
        while (!operators.isEmpty()){
            String val2 = values.pop();
            String val1 = values.pop();
            char op = operators.pop();
            values.push(op+val1+val2);
        }

    }
}