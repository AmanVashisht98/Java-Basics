package Java8_Assessment;

import java.util.Arrays;
import java.util.List;

public class Second {
    public static void main(String[] args) {
        List<String> coursetemp = Arrays.asList("Kubernetes", "Docker", "Cloud", "Microservices","Java");

        //Question 1: Print the  Number of characters in each course
        //Method 1
        List list= coursetemp.stream().map(x->x.length()).toList();
        System.out.println(list);
        //Method 2
        coursetemp.stream().map(x->x.length()).forEach(x-> System.out.print(x + " "));
        System.out.println();

        //Question 2: Print list of courses sorted in order of length of string.
        //Method 1
        coursetemp.stream().sorted((x,y)->  x.length()-y.length()).forEach(x-> System.out.print(x + " "));
        System.out.println();
        //Method 2
        List sortedlist= coursetemp.stream().sorted(((x,y)->x.length()-y.length())).toList();
        System.out.println(sortedlist);

        //Question 3: Write a Java 8 stream operation to filter out all the strings that have length less than 5 from a given list of strings.
        coursetemp.stream().filter(x->x.length()<5).forEach(x-> System.out.print(x + " "));
        System.out.println();

        //Question 4: Given a list of strings, use Java 8 streams to create a new list that contains the uppercase version of each element in the original list.
        List s= coursetemp.stream().map(x->x.toUpperCase()).toList();
        System.out.println(s);

        //Question 5: Write a Java 8 stream operation to concatenate all the strings in a given list into a single string.
        //Method 1
        String concat = coursetemp.stream().reduce("",(x,y)->x+y);
        //Method 2
        String concat1 = coursetemp.stream().reduce("",(x,y)->x.concat(y));
        System.out.println(concat);
        System.out.println(concat1);

        //

    }
}
