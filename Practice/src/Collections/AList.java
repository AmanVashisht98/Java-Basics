package Collections;
import java.util.ArrayList;
import java.util.Collections;

public class AList {
    public static void main(String[] args) {
        //Properties of Arraylist
        //Stores data in form of array
        //Insertion order is maintained
        //Duplicates are not allowed
        //It has indexing so we can perform crud operations at specific index
        //Good for data retrieval and search opeation
        //It is not thread safe
        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(1);
        al.add(2);
        al.add(4);
        System.out.println(al);
        //Collections.sort(al);
//        System.out.println(al);
//        Collections.reverse(al);
//        System.out.println(al);
//        al.remove(0);
//        System.out.println(al);
//        System.out.println(al.size());
//        System.out.println(al.isEmpty());

        //sorting using java sorted method of streams API
        al.stream().sorted().forEach(x -> System.out.print(x + " "));

        System.out.println();

        System.out.println("--------------------------------------------------------------------------------------------------------");

        ArrayList<String> al1 = new ArrayList<>();
        al1.add("aman");
        al1.add("tarun");
        al1.add("neha");
        al1.add("sagar");
        al1.add("yash");
        al1.add("abc");
        al1.add("xyz");

        System.out.println(al1);

        Collections.sort(al1);

        System.out.println(al1);
        System.out.println(al1.get(0)); //get element from any index
        al1.add(0,"first"); //adding element at specific index
        System.out.println(" size: " + al1.size()); //checking size of arraylist
        System.out.println(al1.contains("xyz")); //checking whether the element is present or not

        System.out.println(al1);

        al1.remove("xyz"); //remove object
        al1.remove(0); //remove from index
        al1.set(0,"second"); //replacing element at specific index


        System.out.println(al1);
        System.out.println("size: " + al1.size());
        System.out.println(al1.contains("xyz")); //checking whether the element is present or not



    }
}
