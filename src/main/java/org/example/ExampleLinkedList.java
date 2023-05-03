package org.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class ExampleLinkedList {
    public static void creatingLinkedList(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ram");
        linkedList.add("sham");
        linkedList.add("Jaddu");
        linkedList.add("Madhu");
        System.out.println("Linked list: "+linkedList);
        // Adding an element at the specified position in the LinkedList
        linkedList.add(4,"Ravan");
        // Adding an element at the end of the LinkedList
        linkedList.addLast("Chiku");
        // Adding an element at the beginning of the LinkedList
        linkedList.addFirst("Krishna");
        System.out.println("Linked list after adding new elements: "+linkedList);
        // Adding all the elements from an existing collection to the end of the LinkedList
        ArrayList<String> newEle = new ArrayList<>();
        newEle.add("Mahi");
        newEle.add("dhoni");
        linkedList.addAll(newEle);
        System.out.println("Linked list after adding element from new collection: "+linkedList);

    }

    public static void removeElementLinkedList(){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ram");
        linkedList.add("sham");
        linkedList.add("Jaddu");
        linkedList.add("Madhu");
        linkedList.add("popo");
        linkedList.add("Choko");
        linkedList.addLast("Chiku");
        System.out.println("Initial Linked list : "+linkedList);
        // Remove the first element in the LinkedList
        linkedList.removeFirst();
        System.out.println("After removing first element : "+linkedList);
        // Remove the last element in the LinkedList
        linkedList.removeLast();
        System.out.println("After removing last element : "+linkedList);
        // Remove the specified element in the LinkedList
        linkedList.remove("popo");
        System.out.println("After removing popo - specified element : "+linkedList);
        // Remove the all elements in the LinkedList
        linkedList.clear();
        System.out.println("After removing all elements : "+linkedList);
    }


}
