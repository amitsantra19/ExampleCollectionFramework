package org.example;

import java.util.ArrayList;
import java.util.List;

/*
ArrayList is a dynamic array, we do not have to specify the size while creating it, the size of the array
automatically increases when we dynamically add and remove items.
ArrayList is Underlined data Structure Resizable Array or Growable Array.
ArrayList Duplicates Are Allowed.
Insertion Order is Preserved.
Heterogeneous objects are allowed.
Null insertion is possible.
 */
public class ExampleArrayList {
    public static void createStringArrayList()
    {
        List<String> list = new ArrayList<>();
        list.add("BLR");
        list.add("CCU");
        list.add("MAA");
        list.add("DEL");
        System.out.println("Airports: "+list);
    }
    public static void removeStringArrayList()
    {
        List<String> list = new ArrayList<>();
        list.add("BLR");
        list.add("CCU");
        list.add("MAA");
        list.add("DEL");
        list.remove(3);
        System.out.println("Airports after removing index 3 item: "+list);
    }
    public static void addItemToArrayList(int index, String airportName){
        List<String> list = new ArrayList<>();
        list.add("BLR");
        list.add("CCU");
        list.add("MAA");
        list.add("DEL");
        list.add(index, airportName);
        System.out.println("Airports after adding at "+index+" New List is: " +list);
    }




}

