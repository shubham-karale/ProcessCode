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

    public static class StackImplementationUsingLL {
        static class Node{
            int data;
            Node next;
            public Node(int data){
                this.data = data;
                next = null;
            }
        }

        static class Stack{
            public static Node head;

    //        Empty Operation
            public static boolean isEmpty(){
                if(head==null){
                    return false;
                }
                return true;
            }

    //        Push Elements into the Stack
            public static void push(int data){
    //            Check Stack is Empty or not if empty then add the elements directly to the head
    //            Create New Node to add newNode
                Node newNode = new Node(data);
                if(isEmpty()){
                    head = newNode;
                    return;
                }
    //            If some elements are already present in the stack then just make newNOde as head
                newNode.next = head;
                head = newNode;
            }

    //        ! POP Opetation =
    //        * Check Stack is Empty if it is empty just return
            public static  int pop(){
                if(isEmpty()){
                   return -1;
                }
                int top = head.data;
                head = head.next;
                return top;
            }

    //        ! PEEK() Operation
            public static int peek(){
                if(isEmpty()){
                    return -1;
                }
                int top = head.data;
                return top;
            }


        }

        public static void main(String[] args) {
            System.out.println("Stack Implementation ");
            Stack st = new Stack();
            st.push(25);
            st.push(35);
            st.push(45);
            System.out.println(st.peek());
            System.out.println(st.pop());
            System.out.println(st.peek());

            while(st.head!=null){
                System.out.println(st.pop());
            }

        }
    }
}
