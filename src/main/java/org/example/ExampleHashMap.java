package org.example;

import java.util.HashMap;
import java.util.Map;
/*
Java HashMap is a hash table based implementation of Java’s Map interface. A Map, as you might know,
is a collection of key-value pairs. It maps keys to values.
A HashMap cannot contain duplicate keys.
Java HashMap allows null values and the null key.
HashMap is an unordered collection. It does not guarantee any specific order of the elements.
Java HashMap is not thread-safe. You must explicitly synchronize concurrent modifications to the HashMap.
 */

public class ExampleHashMap {
    public static void creatingHashMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("amit", 31);
        map.put("kumar", 56);
        map.put("santra", 68);
        System.out.println("Initial Map: "+map);
    }
    public static void accessingAndModifyingHashMap(){
        Map<String, String> userCityMapping = new HashMap<>();
        // Check if a HashMap is empty
        System.out.println("is userCityMapping empty? : " + userCityMapping.isEmpty());
        userCityMapping.put("John", "New York");
        userCityMapping.put("Rajeev", "Bengaluru");
        userCityMapping.put("Steve", "London");
        System.out.println("userCityMapping HashMap : " + userCityMapping);
        // Find the size of a HashMap
        System.out.println("We have the city information of " + userCityMapping.size() + " users");
        String userName = "Steve";
        // Check if a key exists in the HashMap
        if(userCityMapping.containsKey(userName)) {
            // Get the value assigned to a given key in the HashMap
            String city = userCityMapping.get(userName);
            System.out.println(userName + " lives in " + city);
        } else {
            System.out.println("City details not found for user " + userName);
        }

        // Check if a value exists in a HashMap
        if(userCityMapping.containsValue("New York")) {
            System.out.println("There is a user in the userCityMapping who lives in New York");
        } else {
            System.out.println("There is no user in the userCityMapping who lives in New York");
        }
        // Modify the value assigned to an existing key
        userCityMapping.put(userName, "California");
        System.out.println(userName + " moved to a new city " + userCityMapping.get(userName) + ", New userCityMapping : " + userCityMapping);
        // The get() method returns `null` if the specified key was not found in the HashMap
        System.out.println("Lisa's city : " + userCityMapping.get("Lisa"));
    }

    public static void iteratingThroughHashMap(){
        Map<String, Double> employeeSalary = new HashMap<>();
        employeeSalary.put("David", 76000.00);
        employeeSalary.put("John", 120000.00);
        employeeSalary.put("Mark", 95000.00);
        employeeSalary.put("Steven", 134000.00);

        System.out.println("Iterating over a HashMap using Java 8 forEach and lambda::");
        employeeSalary.forEach((employee, salary) -> {
            System.out.println(employee + "=" + salary);
        });
        /* Another way
        System.out.println("\n=== Iterating over the HashMap's entrySet using Java 8 forEach and lambda ===");
        employeeSalary.entrySet().forEach(entry -> {
                System.out.println(entry.getKey() + " = " + entry.getValue());
        });
         */
    }

    class Employee {
        private Integer id;
        private String name;
        private String city;

        public Employee(Integer id, String name, String city) {
            this.id = id;
            this.name = name;
            this.city = city;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", city='" + city + '\'' +
                    '}';
        }
    }

    public void hashMapUserDefinedObjectExample(){
        Map<Integer, Employee> employeesMap = new HashMap<>();
        employeesMap.put(1001, new Employee(1001, "Rajeev", "Bengaluru"));
        employeesMap.put(1002, new Employee(1002, "David", "New York"));
        employeesMap.put(1003, new Employee(1003, "Jack", "Paris"));

        System.out.println("User defined object in hashmap: "+employeesMap);
    }

}
