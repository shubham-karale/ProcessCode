package Stack.StackImplementation;

public class StackImplementationUsingArrays {
    static class Stack{
       static int size = 5;
       static int [] arr = new int[size];
        static int top = -1;

        static void push(int data){
            top++;
            arr[top] = data;
        }
//        pop
        static int pop(){
            int ele = arr[top];
            top--;
            return top;
        }

//        ! PEEK
        static int peek(){
            return arr[top];
        }

        static boolean isEmpty(){
            return arr.length==0;
        }

    }
    public static void main(String[] args) {
        System.out.println("Implementation Of Stacks Using Arrays");
        Stack s = new Stack();
        Stack.push(25);
        s.push(85);
        s.push(45);
        s.push(75);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
