package Collections;

import java.util.Collections;
import java.util.LinkedList;

public class LList {
    public static void main(String[] args) {
        //Properties of LinkedList
        //It stores data in form of nodes
        //Insertion order is preserved
        //Duplicates are allowed
        //It has indexing so we can perform crud operations at specific index
        //Suitable for insertion and deletion of data in between
        LinkedList<Integer> list =  new LinkedList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(4);

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);
    }
}
