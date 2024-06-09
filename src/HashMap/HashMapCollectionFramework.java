package HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapCollectionFramework {
    public static void main(String[] args) {
        System.out.println("HashMap Using Collection Framework");
        Map<String,Integer> mp = new HashMap<>();
        // Add the Elements to the Map
        // ENTRY -> KEY + VALUE
        mp.put("Shubham",95);
        mp.put("Rohit",90);
        mp.put("Rohan",85);
        mp.put("Vedant",96);
        mp.put("Arnav",97);
        mp.put("Manish",97);

        // Getting the Value from the Key
        System.out.println(mp.get("Shubham"));
        System.out.println(mp.get("Rohit"));
        // If key is not present then it will return null
        System.out.println(mp.get("Rohit1"));

        // Change the Value of the Key
        System.out.println("Change the Value of the Key");
        mp.put("Shubham",100);

        // HashMap does not maintain the order
        // HashMap has unique keys and it can have duplicate values
        // HashMap put have used for performing two operations -> Insertion and Update

        // ! REMOVE OPERATION
        // Remove the Key and Value
        System.out.println("Remove Operation");
        mp.remove("Shubham");
        System.out.println(mp.get("Shubham"));

        // ! CONTAINS OPERATION
        // Check if the key is present or not
        System.out.println("Contains Key");
        System.out.println(mp.containsKey("Rohit"));
        System.out.println(mp.containsKey("Rohit1"));

        // ! Add New Key and Value if and only if the key is not present
        System.out.println("PutIfAbsent");
        System.out.println(mp.putIfAbsent("Mrunal", 100));
           System.out.println(mp.putIfAbsent("Mrunal", 100));

        // ! Replace the Value of the Key if and only if the key is present
        System.out.println("Replace");
        mp.replace("Rohit", 100);

        // GET ALL THE KEYS
        System.out.println("Get All the Keys");
        System.out.println(mp.keySet()); // Set of Keys
        System.out.println(mp.values()); // Collection of Values
        System.out.println(mp.entrySet()); // Set of Entry

        // Traversing the HashMap ALL METHODS
        System.out.println("Traversing the HashMap");
        // Method 1
        System.out.println("Method 1");
        for(String key:mp.keySet()){
            System.out.println(key + " " + mp.get(key));
        }
        // Method 2
        System.out.println("Method 2");
        for(Map.Entry<String,Integer> entry:mp.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Method 3 From Java 10
        System.out.println("Method 3");
        for (var entry:mp.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Method 4
        System.out.println("Method 4");
        mp.forEach((k,v) -> {
            System.out.println(k + " " + v);
        });

        // Method 5
        System.out.println("Method 5");
        mp.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

        // Method 6
        System.out.println("Method 6");
        mp.keySet().stream().forEach(key -> {
            System.out.println(key + " " + mp.get(key));
        });

        // Method 7
        System.out.println("Method 7");
        mp.values().stream().forEach(value -> {
            System.out.println(value);
        });


    }
}
