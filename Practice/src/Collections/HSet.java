package Collections;

import java.util.HashSet;

public class HSet {
    public static void main(String[] args) {
        //Properties of HashSet
        //Insertion Order is not maintained
        //It is not index based so we cannot access elements from specific index
        //Duplicates are not allowed
        HashSet<String> set =  new HashSet<>();
        set.add("aman");
        set.add("aman");
        set.add("aman");
        set.add("tarun");
        set.add("neha");
        set.add("sagar");
        set.add("yash");
        System.out.println(set);

        //traversing using forEach() method of java8
        System.out.println("traversing using forEach() method of java8");
        set.forEach(x-> System.out.println(x));

    }
}
