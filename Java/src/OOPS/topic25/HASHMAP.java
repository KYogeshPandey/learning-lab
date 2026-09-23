package OOPS.topic25;

import java.util.HashMap;

public class HASHMAP {
    public static void main(String[] args) {

        // Hashmap = A data-structures that stores key-value pairs.
        //           Keys areunique, but values can be duplcated.
        //           Does not maintain any order , but is memory efficient
        //           HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.35);
        map.put("coconut", 1.00);

        // map.remove("apple");

        //System.out.println(map.get("apple"));

        //System.out.println(map.containsKey("Pineapple"));

        if(map.containsKey("Pineapple")){
            System.out.println(map.get("Pineapple"));
        }
        else{
            System.out.println("Key not found!");
        }

        // System.out.println(map.containsValue(1.0000));

        // System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key + " : $" + map.get(key));
        }
    }
}
