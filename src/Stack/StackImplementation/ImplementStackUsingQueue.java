package Stack.StackImplementation;
/*
  ! Implementation of Stack Using Two Queues
  As we know that Queue is a FIFO data structure and Stack is a LIFO data structure.
  That means Queue first element should be the last element in the Stack.
    So, we can implement the Stack using Two Queues.

    Enqueue Operation
    1. Add the Element to the Queue 2
    2. Add the Elements of Queue 1 to Queue 2
    3. Swap the Queue 1 and Queue 2

    Dequeue Operation
    1. Check the Stack is Empty or Not
    2. If Not Empty then Pop the Element from the Queue 1

    Peek Operation
    1. Check the Stack is Empty or Not
    2. If Not Empty then Peek the Element from the Queue 1

    isEmpty Operation
    1. Check the Stack is Empty or Not
    E
 */

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    static class Stack{
        static int size;
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

//        ! isEmpty() = Stack is Empty Or Not using Queue
        public static boolean isEmpty(){
            return q1.isEmpty();
        }

//        ! Push Operation in Stack using Queue
        public static void push(int data){
//            Add the Element to the Queue 2
            q2.add(data);
//            Add the Elements of Queue 1 to Queue 2
            while(!q1.isEmpty()){
                q2.add(q1.poll());
            }
//            Swap the Queue 1 and Queue 2
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;
        }

//        ! Pop Operation in Stack using Queue
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            return q1.poll();
        }

//        ! Peek Operation in Stack using Queue
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return q1.peek();
        }



    }
    public static void main(String[] args) {
        System.out.println("Implement Stack using Queue");
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
