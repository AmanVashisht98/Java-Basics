package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListPractice<I extends Number> {

    public static void main(String[] args) {

        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        //"Copy on write" array list means whenever we do a write operation such as adding or removing an element.
        //Instead of directly modifying the existing list, a new copy of list is created and then modification is applied to that copy.
        //It means that the other threads which are reading the list while it's being modified are unaffected.

        //Read Operations: Fast and direct as they happen on the original list without any modification.
        //Write Operations: A new copy of list is created for every modification. The reference to the list is then updated so that subsequent reads use this new list.

//        List<String> list2 = new ArrayList<>();
//        list2.add("Milk");
//        list2.add("Butter");
//        list2.add("Eggs");
//
//        for(String item:list2){
//            System.out.println(item);
//            if(item.contains("Butter")){
//                list2.add("Bread");
//            }
//        }
        //If we try to modify a Arraylist while iterating it, we get concurrent modification exception
        //So, if we want to modify a list while iterating, we use CopyonWriteArrayList as it does not throw concurrent modification exception

        List<String> list3 = new CopyOnWriteArrayList<>();
        list3.add("Milk");
        list3.add("Butter");
        list3.add("Eggs");

        for(String item:list3){
            System.out.println(item);
            if(item.contains("Butter")){
                list3.add("Bread");
            }
        }
        System.out.println(list3);
    }
}
