package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traversal {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<>();
        list.add("aman");
        list.add("tarun");
        list.add("neha");
        list.add("sagar");
        list.add("yash");

        //traversing using for each loop
        System.out.println("traversing usinf forEach loop");
        for(String name:list){
            System.out.println(name);
        }

        System.out.println("-------------------------------------------------------------");

        //traversing using Iterator
        System.out.println("traversing using Iterator");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next() + " ");
        }

        System.out.println("-------------------------------------------------------------");

        //traversing using ListIterator
        System.out.println("travversing using List Iterator");
        ListIterator<String> litr = list.listIterator(list.size()); //passing list.size() to move the curson to last index
        while(litr.hasPrevious()){
            System.out.println(litr.previous());
        }

        System.out.println("-------------------------------------------------------------");
        //traversing using forEach() of java8
        System.out.println("traversing using forEach() method of java8");
        list.forEach(x-> System.out.println(x));
    }
}
