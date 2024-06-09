package Stack;

import java.util.Stack;

@SuppressWarnings("t")
public class Qu6_InfixToPostfix {
    static int precedence(char ch){
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

    static void postfixUsingPw(String str){
        Stack<Character> operator = new Stack<>(); // * Stack for Operators
        Stack<String> values = new Stack<>(); // * Stack for Values
        for(int i = 0;i< str.length();i++){ // * Traverse the string
            char ch = str.charAt(i); // * Character
            int ascii = (int) ch; // * Ascii Value
            if(ascii>=48 && ascii <= 57 || ascii>=65 && ascii<=90 || ascii>=97 && ascii<=122){ // * Check if the character is letter or digit
                values.push(ch+"");
            }
            else if(ch=='('){ // * Check if the character is opening bracket
                operator.push(ch); // * Push the character to the stack
            }
            else if(ch==')'){ // * Check if the character is closing bracket
                while (!operator.isEmpty() && operator.peek()!='('){ // * Pop the elements from the stack till the opening bracket
                    char op = operator.pop();
                    String v2 = values.pop();
                    String v1 = values.pop();
                    String val = v1+v2+op;
                    values.push(val);
                }
                operator.pop(); // * Pop the opening bracket
            }
            else{
                while (!operator.isEmpty() && precedence(ch)<=precedence(operator.peek())){ // * Check if the precedence of the operator is less than the precedence of the operator in the stack
                    char op = operator.pop();
                    String v2 = values.pop();
                    String v1 = values.pop();
                    String val = v1+v2+op;
                    values.push(val);
                }
                operator.push(ch);

            }
        }
        // pop the remaining elements from the stack
        while (!operator.isEmpty()){
            char op = operator.pop();
            String v2 = values.pop();
            String v1 = values.pop();
            String val = v1+v2+op;
            values.push(val);
        }
        System.out.println(values.peek());
    }

    // Postfix Conversion
    static void postfix(String str){
        String result = "";
        // Stack
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            // Character
            char ch = str.charAt(i);
            // check if character is letter or digit if yes then add to the result
            if(Character.isLetterOrDigit(ch)){
                result += ch;
            }
            // check if character is opening bracket if yes then push to the stack
            else if(ch=='('){
                stack.push(ch);
            }
            // check if character is closing bracket if yes then pop the elements from the stack till the opening bracket
            else if(ch==')'){
                while (!stack.isEmpty() && stack.peek()!='('){
                    result += stack.pop();
                }
                // pop the opening bracket
                stack.pop();
            }
            // check if character is operator if yes then check the precedence of the operator
            else{
                // if precedence of the operator is less than the precedence of the operator in the stack then pop the elements from the stack
                while (!stack.isEmpty() && precedence(ch)<=precedence(stack.peek())){
                    result += stack.pop();
                }
                stack.push(ch);
            }
        }
        // pop the remaining elements from the stack
        while (!stack.isEmpty()){
            result += stack.pop();
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        System.out.println("Infix to Postfix");
        String str = "9-(5+3)*4/6";
        postfix(str);
        postfixUsingPw(str);
    }
}
