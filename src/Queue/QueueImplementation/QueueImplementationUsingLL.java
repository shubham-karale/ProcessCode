package Queue.QueueImplementation;

public class QueueImplementationUsingLL {
    static class Node{
        int data;
        Node next;
        static Node head = null;
        static Node tail = null;

        Node(int data){
            this.data = data;
            this.next = null;
        }

//        ! isEmpty() = head and tail = null if yes return true
        public static boolean isEmpty(){
            if(head==null && tail==null){
                return true;
            }
            return false;
        }

//        ! Enqueue Operation in Queue  = Add Elements to the Queue
        public static void add(int data){
            Node newNode = new Node(data);
            // ! If Queue is Empty
            if(isEmpty()){
                head = tail = newNode;
                return;
            }else{
                // ! If Queue is not Empty
                tail.next = newNode;
                tail = newNode;
            }

        }

//        ! Dequeue Operation in Queue = Remove Elements from the Queue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int element = head.data;
            if(head==tail){
                head = tail = null;
            }else{
                head = head.next;
            }
            return element;
        }

//        ! Peek Operation in Queue = Get the Front Element of the Queue
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        } 



    }
    public static void main(String[] args) {
        System.out.println("Queue Implementation Using Linked List");
    }
}
