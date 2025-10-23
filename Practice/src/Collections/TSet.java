package Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TSet {
    public static void main(String[] args) {
        //Properties of TreeSet
        //By default it stores elements in natural sorting order (ascending order)
        //We can change the insertion order to descending using Comparator.reverseOrder() in its constructor
        //It does not maintain insertion order
        //It is not index based so we cannot access elements from specific index
        //Duplicates are not allowed

        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder()); //changing the insertion order to reverse order
        set.add(3);
        set.add(2);
        set.add(1);
        set.add(4);
        set.add(5);
        set.add(5);
        set.add(5);
        System.out.println(set);

        TreeSet<Integer> set1 = new TreeSet<>((a,b)->b-a); //overriding comparator using lambda interface to sort in descending order
        set1.add(3);
        set1.add(2);
        set1.add(1);
        set1.add(4);
        set1.add(5);
        set1.add(5);
        set1.add(5);
        set1.add(7);

        //traversing using forEach() method of java8
        System.out.println("traversing using forEach() method of java8");
        set1.forEach(x-> System.out.println(x));
    }
}
