package org.example;
/*
Java HashSet class is a member of Java collection framework. It implements the Set interface. HashSets are used to
store a collection of unique elements.
HashSet cannot contain duplicate values.
HashSet allows null value.
HashSet is an unordered collection. It does not maintain the order in which the elements are inserted.
HashSet internally uses a HashMap to store its elements.
HashSet is not thread-safe. If multiple threads try to modify a HashSet at the same time, then the final outcome is
not-deterministic. You must explicitly synchronize concurrent access to a HashSet in a multi-threaded environment.
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExampleHashSet {
    public static void CreateAndManipulateHashSet () {
        Set<String> daysOfWeek = new HashSet<>();
        // Adding new elements to the HashSet
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        // Adding duplicate elements will be ignored, as set contains only unique elements
        daysOfWeek.add("Monday");
        System.out.println("Days of the Week: "+daysOfWeek);
        // Iterating through hashset
        System.out.println("Iterating through set : ");
        daysOfWeek.forEach(days ->{
            System.out.println(days);
        });
        // Another way to loop through set
        /*
        for(String days : daysOfWeek){
            System.out.println(days);
        }*/
        // Accessing Hashset
        if(daysOfWeek.contains("Monday")){
            System.out.println("True: HashSet has Monday");
        }
        //Removing single Element from HashSet
        daysOfWeek.remove("Monday");
        System.out.println("Hashset after removing Monday: "+ daysOfWeek);
        //Removing Collection from Hashset
        List<String> weekEnds = new ArrayList<>();
        weekEnds.add("Saturday");
        weekEnds.add("Sunday");
        daysOfWeek.removeAll(weekEnds);
        System.out.println("After removing weekends from Days of the week: "+daysOfWeek);
        // Clearing off entire Hashset
        daysOfWeek.clear();
        System.out.println("After Clearing off : "+ daysOfWeek);
    }

}
