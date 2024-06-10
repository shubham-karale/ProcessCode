package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Qu1_FrequencyOfanElementAndReturnEleWhoHasMaxFrequency {
    public static void main(String[] args) {
        System.out.println("Frequency of an Element and Return Element Who has Max Frequency");
        int [] arr = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,1,2,3,4,1,2,3,1,2,1};
        int n = arr.length;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i],1);
            }
        }

        // Prints the HashMap
        System.out.println(mp);

        // Find Out which elemetns have max frequency
        System.out.println("Traversal of HashMap");
        int max = Integer.MIN_VALUE;
        int element = -1;
        for(Map.Entry<Integer,Integer> e : mp.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                element = e.getKey();
            }
        }
        System.out.println("Element who has max frequency is: "+element);

        // Using var variable
        int max1= Integer.MIN_VALUE;
        int el = -1;
        for(var x : mp.entrySet()){
            if(x.getValue() > max1){
                max1 = x.getValue();
                el = x.getKey();
            }
        }

        System.out.println("Element who has max frequency is: "+el);

        // Using KeySet
        System.out.println("Find Max Frequency Element using KeySet");
        int max2 = Integer.MIN_VALUE;
        int ele = -1;
        for(int x : mp.keySet()){
            if(mp.get(x) > max2){
                max2 = mp.get(x);
                ele = x;
            }
        }
        System.out.println("Element who has max frequency is: "+ele);



    }
}

