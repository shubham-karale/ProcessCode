package Hashing;

import java.util.LinkedList;

public class HashMapImplementation {
    static class MyHashMap<K,V>{
        //Creating default capacity
        public static final int DEFAULT_CAPACITY = 4;
        //Create Load Factor
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private int n; // Number of key-value pairs


        // Create Node Class Which have key and value pair
        private  class Node{
            K key; // Key
            V value; // Value
            Node next;
            public Node(K key,V value){
                this.key = key;
                this.value = value;
            }
        }

        private LinkedList<Node> [] buckets; // Array of LinkedList of Nodes

        // * Create HashFunction which will return the hashcode of the key
        private int HashFunction(K key){
           int  hc = key.hashCode();
           return ( Math.abs(hc) ) % buckets.length; // Because we want values should be in range of 0 to N-1

        }

        // Create InitBuckets functions which will initialize the buckets with LinkedList
        private void initBuckets(int N){ // N = Capacity of the HashMap
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length ; i++) { // ! Change N to buckets.length if any errors Occurs
                buckets[i] = new LinkedList<>();
            }
        }

        // Parameterless Constructor
        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }

        public int capacity(){
            return buckets.length;
        }

        public float loadFactor(){
            return n*1.0f/buckets.length;
        }



        // All HashMaps functions
        //Size() = Returns the size of the HashMap
        public int size(){
            return n;
        }


        // Rehashing() = Rehashing is the process of doubling the capacity of the HashMap
        private void rehash(){
            // Create a new array of LinkedList of Nodes
            LinkedList<Node> [] oldBuckets = buckets;
            // Create a new array of LinkedList of Nodes with double the capacity
            initBuckets(2*oldBuckets.length);
            // Traverse the oldBuckets and insert the key-value pair in the new buckets
            n = 0;
            // Traverse the oldBuckets
            for (int i = 0; i < oldBuckets.length ; i++) {
                // Traverse the LinkedList
                LinkedList<Node> currBucket = oldBuckets[i];
                //
                for (Node node : currBucket) {
                    put(node.key,node.value);
                }
            }
        }

        /*
//          We can not directly insert Node of key-value in these case beacause we have to first check if the key is already present in the map or not
//          If the key is already present then we have to update the value of the key
//          If the key is not present then we have to insert the key-value pair in the map
         */
        // put() = Inserts the key-value pair in the map
        public void put(K key,V value){
            int bi  = HashFunction(key);
            LinkedList<Node> currBucket = buckets[bi];
           int ei =  searchInBucket(key,currBucket);
              if(ei == -1){
                // Insert the key-value pair in the map
                Node newNode = new Node(key,value);
                currBucket.add(newNode);
                n++;
              }
              else {
                // Update the value of the key
                Node node = currBucket.get(ei);
                node.value = value;
              }

              if(n >= buckets.length*DEFAULT_LOAD_FACTOR){
                  rehash();
              }

        }

        // * searchInBucket() = Searches the key in the bucket
        // * Traverse the LinkedList and check if the key is present in the LinkedList or not
        private int searchInBucket(K key,LinkedList<Node> ll){
            for (int i = 0; i < ll.size() ; i++) {
                if(ll.get(i).key==key) {
                    return i;
                }
            }
            return -1;

        }

        // get() = Returns the value of the key
        public V get(K key){
            int bi = HashFunction(key);
            // Get the bucket
            LinkedList<Node> currBucket = buckets[bi];
            // Search the key in the bucket
            int ei = searchInBucket(key,currBucket);
            if(ei == -1){
                return null;
            }
            else {
                Node currNode = currBucket.get(ei);
                return currNode.value;
            }
        }

        // remove() = Removes the key-value pair from the map
        public V remove(K key){
            // Get the bucket index
            int bi = HashFunction(key);
            // Get the bucket
            LinkedList<Node> currBucket = buckets[bi];
            // Search the key in the bucket
            int ei = searchInBucket(key,currBucket);
            // If the key is not present in the map
            if(ei == -1){
                return null;
            }
            // If the key is present in the map
            else {
                Node currNode = currBucket.get(ei);
                V value = currNode.value;
                currBucket.remove(ei);
                n--;
                return value;

            }
        }

        // containsKey() = Returns true if the key is present in the map
        public boolean containsKey(K key){
            int bi = HashFunction(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(key,currBucket);
            return ei != -1;

        }


    }
    public static void main(String[] args) {
        System.out.println("HashMap Implementation");
        MyHashMap<String,Integer> map = new MyHashMap<>();
        map.put("India",100);
        map.put("USA",200);
        map.put("UK",300);
        map.put("Russia",400);
        System.out.println(map.get("India"));
        System.out.println(map.get("USA"));
        System.out.println(map.get("UK"));
        System.out.println(map.get("Russia"));
        map.remove("India");
        System.out.println(map.get("India"));
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("USA"));
        System.out.println(map.containsKey("UK"));
        System.out.println(map.containsKey("Russia"));
        System.out.println( map.capacity());
        System.out.println(  map.loadFactor());
    }
}
