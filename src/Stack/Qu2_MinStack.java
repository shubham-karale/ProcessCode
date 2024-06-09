package Stack;

import java.util.Stack;

public class Qu2_MinStack {
   static class Pair{
        int x,y;
        Pair(int x,int y){
            this.x = x;
            this.y = y; // = y = Stores Min Element from the Stack
        }

    }
   static class MinStack{
        static Stack<Pair> st;
        public MinStack(){
            st = new Stack<>();
        }

//        isEmpty()
        public static boolean isEmpty(){
            return st.isEmpty();
        }

//        Push Element to the Stack
        public static void push(int data){
            int  min;
            if(st.isEmpty()){
                min = data; // if stack is empty then that means min element is data
            }
            else {
                min = Math.min(st.peek().y,data); // y shows min element comapre data and min ele from stack
            }
            st.push(new Pair(data,min)); // add new pair in stack which conatins data and min element from the stack
        }

//        Pop Element from the Stack
        public static int pop(){
            if(st.isEmpty()){
                return -1;
            }
            int top = st.peek().x; // x contains Normal data ele y = Min Ele from Stack
            st.pop();
            return top;

        }

//        Peek() from the Stack  = top element from the Stack
        public static int peek(){
            if(st.isEmpty()) return -1;
            int top = st.peek().x;
            return top;
        }

//        getMin() = Min Element from the Stack
        public static int getMin(){
            if(st.isEmpty()) return -1;
            int ele = st.peek().y; // y = Min Ele from Stack
            return ele;
        }



    }
    public static void main(String[] args) {
        System.out.println("Min Stack");
        MinStack stack = new MinStack();
        MinStack.push(10);
        MinStack.push(20);
        MinStack.push(30);
        System.out.println(MinStack.pop());
        System.out.println(MinStack.peek());
        System.out.println(MinStack.getMin());

    }
}
