package org.example;

public class Main {
    public static void main(String[] args) {
        ExampleArrayList.createStringArrayList();
        System.out.println();
        ExampleArrayList.removeStringArrayList();
        System.out.println();
        ExampleArrayList.addItemToArrayList(2,"MUM");
        System.out.println();
        ExampleArrayList.iterateArrayListUsingForeachLambda();
        System.out.println();
        ExampleArrayList arrayList = new ExampleArrayList();
        arrayList.arrayListObjectSortingExample();
        System.out.println();
        ExampleLinkedList.creatingLinkedList();
        System.out.println();
        ExampleLinkedList.removeElementLinkedList();
        System.out.println();
        ExampleHashMap.creatingHashMap();
        System.out.println();
        ExampleHashMap.accessingAndModifyingHashMap();
        System.out.println();
        ExampleHashMap.iteratingThroughHashMap();
        System.out.println();
        ExampleHashMap hashMap = new ExampleHashMap();
        hashMap.hashMapUserDefinedObjectExample();
        System.out.println();
        ExampleLinkedHashMap.createAndAccessLinkedHashMap();
        System.out.println();
        ExampleHashSet.CreateAndManipulateHashSet();
    }
}