package org.example;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicReference;

/*
The HashMap class does not guarantee any specific iteration order of the elements. It does not keep track of the order
in which the elements are inserted, and produces the elements in a random order every time you iterate over it.
A LinkedHashMap cannot contain duplicate keys.
LinkedHashMap can have null values and the null key.
Unlike HashMap, the iteration order of the elements in a LinkedHashMap is predictable.
Just like HashMap, LinkedHashMap is not thread-safe. You must explicitly synchronize concurrent access to a
LinkedHashMap in a multi-threaded environment.
 */
public class ExampleLinkedHashMap {
    public static void createAndAccessLinkedHashMap() {
        // Creating a LinkedHashMap
        LinkedHashMap<String, Integer> wordNumberMapping = new LinkedHashMap<>();

        // Adding new key-value pairs to the LinkedHashMap
        wordNumberMapping.put("one", 1);
        wordNumberMapping.put("two", 2);
        wordNumberMapping.put("three", 3);
        wordNumberMapping.put("four", 4);
        // Add a new key-value pair only if the key does not exist in the LinkedHashMap, or is mapped to `null`
        wordNumberMapping.putIfAbsent("five", 5);
        System.out.println("Linked Hashmap: "+wordNumberMapping);
        //Access Linked Hashmap using key
        if(wordNumberMapping.containsKey("two")){
            System.out.println("value of two: "+wordNumberMapping.get("two"));
        }else{
            System.out.println("Key does not exists");
        }
        //Access Linked Hashmap using value
        final String[] desiredKey = {null};
        int givenValue= 5;
        // Iterating Linked Hashmap
        wordNumberMapping.forEach((key, value) -> {
            if (value == givenValue) {
                desiredKey[0] = key;
                System.out.println("Desired key with given value(5) : " + desiredKey[0]);
            }
        });
    }

}
