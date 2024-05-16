package Queue.QueueImplementation;

import java.util.Stack;
/*
* Implement a Queue using two Stacks
   ! Enqueue Operation
   * Add all the Elements to the Stack2 till the Stack 1 is not empty
   * Add the New Elements to the Stack 1
   * Pop the Elements from the Stack 2 to Stack 1
 */

/*
     TIME COMPLEXITY
     Push Operation = O(N)
     Pop Operation = O(1)
     Peek Operation = O(1)
     Auxiliary Space = O(N)
 */

public class ImplementQueueUsingTwoStacks {
    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

//      !  Enqueue Operation
        public static void enqueue(int data){
//            Pop Elements from S1 till the S1 is not Empty
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
//            Add new Elements
            s1.push(data);
//            Pop Elements from the Stack 2 till the Stack 2 is not Empty then add the elements to the Stack 1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

//        ! DeQueue Operation
        /*
             Check Stack 1 is an empty or not
             store the first element into the variable
             Pop the first element
         */
        public static int dequeue(){
//            check stack 1 is not and empty if yes return -1
            if(s1.isEmpty()){
                return -1;
            }
            int ele = s1.peek();
            s1.pop();
            return ele;
        }
//        ! PEEK Operation
        public static int peek(){
            if(s1.isEmpty()){
                return -1;
            }
            return s1.peek();
        }

//        ! isEmpty Operation
        public static boolean isEmpty(){
            return s1.isEmpty();
        }


    }
    public static void main(String[] args) {

        System.out.println("Implement Queue using Two Stacks");
    }
}
