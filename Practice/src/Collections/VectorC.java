package Collections;

import java.util.ArrayList;
import java.util.Vector;

public class VectorC {
    public static void main(String[] args) {
        //Properties of Vector
        //It is synchronized(thread-safe)
        //Insertion order is maintained
        //Duplicates are not allowed
        //It has indexing so we can perform crud operations at specific index

        ArrayList<String> list = new ArrayList<>();
        list.add("aman");
        list.add("tarun");
        list.add("neha");
        list.add("sagar");
        list.add("yash");
        System.out.println("list " + list);

        Vector<String> vector =  new Vector<>();
        vector.addAll(list);
        System.out.println("vector " + vector);
        vector.add("abc");
        System.out.println("vector " + vector);
    }
}
