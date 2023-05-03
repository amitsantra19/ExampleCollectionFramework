package org.example;

import java.util.ArrayList;
import java.util.Comparator;
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

    public static void iterateArrayListUsingForeachLambda()
    {
        List<String> items = new ArrayList<>();
        items.add("BLR");
        items.add("CCU");
        items.add("MAA");
        items.add("DEL");
        System.out.println("Airports :");
        //Iterate using Java 8 forEach and lambda
        items.forEach(System.out::println);
        /*
            multiple ways of iteration
            1. for (String item : items) {
                    System.out.println(item);
                }
            2. for(int i = 0; i < items.size(); i++) {
                System.out.println(items.get(i));
                }
            3. Iterator<String> itemIterator = items.iterator();
               while (itemIterator.hasNext()) {
                    String item = itemIterator.next();
                     System.out.println(item);
                }
            4. items.forEach(item -> {
                    System.out.println(item);
                });
         */
    }


    class User {
        private String name;
        private int age;
        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        @Override
        public String toString() {
            return "{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public void arrayListObjectSortingExample(){
        List<User> user = new ArrayList<>();
        user.add(new User("amit", 31));
        user.add(new User("kumar", 54));
        user.add(new User("santra", 35));
        user.add(new User("papai", 32));
        user.add(new User("ishita", 31));
        user.add(new User("kuhu", 2));
        System.out.println("Before Soring Object List: "+user);
        user.sort(Comparator.comparingInt(User::getAge));
        /*
        Some other to write this above sorting logic
            user.sort((user1, user2) -> {
            return user1.getAge() - user2.getAge();
            or
            Collections.sort(user, Comparator.comparing(User::getName));
        });
         */
        System.out.println("After Soring Object List: "+user);

    }


}

