package Stack.StackImplementation;

public class StackImplementationUsingArrays {
    static class Stack{
       static int size = 5;
       static int [] arr = new int[size];
        static int top = -1;

        static void push(int data){
            if(isFull()){
                System.out.println("Stack is Full");
            }
            else{
                top++;
                arr[top] = data;
            }
        }
//        pop
        static int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return 0;
            }
            else{
                int topElement = arr[top];
                top--;
                return topElement;
            }
        }

//        ! PEEK
        static int peek(){
            return arr[top];
        }

        static boolean isEmpty(){
            return arr.length==0;
        }

//         Check Arrays is full or not
        static boolean isFull(){
            return top == size-1;
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
