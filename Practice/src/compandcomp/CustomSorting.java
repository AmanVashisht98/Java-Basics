package compandcomp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CustomSorting {
    public static void main(String[] args) {

        ArrayList<User> al=new ArrayList<>();

        al.add(new User(6,25,1,"Aman",8076026017l));
        al.add(new User(5.11,24,7,"Tarun",8076012345l));
        al.add(new User(5.1 ,23,3,"Neha",8076054321l));
        al.add(new User(5.9,22,14,"Sagar",8076067532l));
        al.add(new User(5.8,21,5,"Yash",807607654l));

        System.out.println(al);
        Collections.sort(al); // sorting by overriding compareTo method of Comparable class
        System.out.println(al);

        //sorting by overriding compare method of comparator class - Method 1(overriding in another class)
        Collections.sort(al,new ComparatorSort());
        System.out.println(al);

        //sorting by overriding compare method of comparator class - Method 2(overriding by making anonymous class)
        Collections.sort(al, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(al);

        //sorting by overriding compare method of comparator class - Method 3(overriding using lambda expression)
        Collections.sort(al,(o1, o2) ->  o1.getId()-o2.getId());
        System.out.println(al);

   }
}
