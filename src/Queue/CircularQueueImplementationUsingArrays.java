package Queue;

public class CircularQueueImplementationUsingArrays {
    static class CircularQueue{

        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;
        CircularQueue(int size){
            this.size = size;
            arr = new int[size];
        }
        public static boolean isEmpty(){
            if(rear==-1 && front==-1){
                return true;
            }
            return false;
        }
//        ! Queue full condition
        public static boolean isFull(){
            if((rear+1)%size==front){
                return true;
            }
            return false;
        }
//        ! ENQUEUE Operation in Queue = Add Elements to the Queue
        public static void enqueue(int data){
            if(isFull()){
                System.out.println("Queue is Full");
                return;
            }
            if(front==-1 && rear==-1){
                front = rear = 0;
                arr[rear] = data;
            }else{
                rear = (rear+1)%size;
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
                front = (front+1)%size;
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
        System.out.println("Circular Queue Using Arrays");
    }
}
