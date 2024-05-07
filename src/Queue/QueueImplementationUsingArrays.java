package Queue;

public class QueueImplementationUsingArrays {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;
        Queue(int size){
            this.size = size;
            arr = new int[size];
        }
        public static boolean isEmpty(){
            if(rear==-1 && front==-1){
                return false;
            }
            return true;
        }
//        ! ENQUEUE Operation in Queue = Add Elements to the Queue
        public static void enqueue(int data){
            if(rear==size-1){
                System.out.println("Queue is Full");
                return;
            }
            if(front==-1 && rear==-1){
                front = rear = 0;
                arr[rear] = data;
            }else{
                rear++;
                arr[rear] = data;
            }
        }

//        ! DEQUEUE Operation in Queue = Remove Elements from the Queue
        public static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int element = arr[front];
            if(front==rear){
                front = rear = -1;
            }else{
                front++;
            }
            return element;
        }

//        ! PEEK Operation in Queue = Get the Front Element of the Queue
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[front];
        }

    }
    public static void main(String[] args) {
        System.out.println("Queue Implementation using Arrays");
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue.peek());
        System.out.println(queue.dequeue());
        System.out.println(queue.peek());
    }
}
