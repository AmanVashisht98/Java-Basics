package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HMap {
    public static void main(String[] args) {
        //HashMap stores key, value pairs. It does not maintain insertion order of elements.
        //Hashmap allows only one null key, but it allows multiple null values.
        //It is not thread safe; requires external synchronization if used in a multi-threaded context.
        //It offers constant-time performance (O(1)) for basic operations like get and put, assuming hash functions disperses elements properly.

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"aman");
        map.put(2,"tarun");
        map.put(3,"neha");
        map.put(4,"sagar");
        map.put(5,"yash");
        map.put(6,"abc");
        map.put(6,"xyz");
        System.out.println(map);
        System.out.println(map.get(5)); //getting value related to specific key
        System.out.println(map.keySet()); //keySet() is used for getting all the keys

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("printing hashmap using entryset");
        System.out.println(map.entrySet()); //entrySet() is used for getting all the key value pairs

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("traversing using forEach() method of java8");
        map.forEach((key,value)-> System.out.println(key + "->" + value));

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("traversing using for each loop");
        for(Integer i :map.keySet()){
            System.out.println(i + "->" + map.get(i));
        }

        System.out.println("---------------------------------------------------------------------------");
        System.out.println("traversing using entrySet");
        for(Map.Entry<Integer, String> e: map.entrySet()){
            System.out.println(e.getKey() + "->" + e.getValue());
        }

        //Revision==================================================================================================================================
        System.out.println("HashMap Revision======================================================================================================");
        HashMap<Integer, String> students =  new HashMap<>();
        students.put(1, "Aman");
        students.put(2, "Tarun");
        students.put(3, "Neha");
        students.put(4, "Sagar");
        students.put(75, "Yash");
        students.put(31, "xyz");

        //get()- to print the value related to key
        System.out.println(students.get(75));
        System.out.println("---------------------------------------");

        //containsKey() - to check whether key is present
        System.out.println(students.containsKey(1));
        System.out.println("---------------------------------------");

        //ContainsValue() - to check whether value is present
        System.out.println(students.containsValue("Aman Vashisht"));
        System.out.println("---------------------------------------");

        //Printing all keys/values of a HashMap using keySet()
        Set<Integer>  set = students.keySet();
        for(int key : set){
            System.out.println( key + " ->" + students.get(key));
        }
        System.out.println("---------------------------------------");

        //Printing all values of a HashMap using entrySet
        //we can use entryset to perform operations on values of a hashmap
        Set<Map.Entry<Integer, String>> entries = students.entrySet();
        for(Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "->" +  entry.getValue());
        }
        System.out.println("---------------------------------------");

        //We can modidy the values of a map using setValue()
        for(Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.setValue(entry.getValue()).toUpperCase());
        }
        System.out.println("---------------------------------------");

        //remove() to remove the value from HashMap
        students.remove(31);
        System.out.println(students);


    }
}
