package OOPS.topic18;

import java.util.ArrayList;
import java.util.Collections;

public class ARRAYLIST {
    static void main(String[] args) {

        // ArrayList = A resizable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayLists can change.

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        fruits.add("kiwi");

        // fruits.remove(0);
        fruits.set(0,"pineapple");

        // System.out.println(fruits.get(1));

        System.out.println(fruits.size());

        Collections.sort(fruits);

        for(String fruit : fruits){
            System.out.println(fruit);
        }

    }




}
