package Stack.StackImplementation;

import java.util.ArrayList;

public class StackImplementationUsingArrayList {
   static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

//        ! isEmpty()
        public static boolean isEmpty(){
            if(list.size()==0){
                return false;
            }
            return true;
        }

//        ! Push() Elements
       public static void push(int data){
            list.add(data);
       }

//       ! POP Elements
       public static int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
       }

//       ! PEEK Top elements
       public static int peek(){
            int top = list.get(list.size()-1);
            return top;
       }

    }
    public static void main(String[] args) {
        System.out.println("Stack Implementation Using an ArrayList");
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());


    }
}
