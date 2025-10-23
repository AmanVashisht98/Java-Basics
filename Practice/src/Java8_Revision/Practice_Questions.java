package Java8_Revision;

import java.util.*;
import java.util.stream.Collectors;

public class Practice_Questions {

    public static void main(String[] args) {

        //Question 1: Java programm to count the occurence of each character in a string
        String s = "ilovemyindia";
        System.out.println(Arrays.stream( s.split("")).collect(Collectors.groupingBy(x->x, Collectors.counting())));
        System.out.println("-------------------------------");

        //Question 2: Java programm to find all duplicate elements from a given string
        String s1 = "ilovemycountryindia";
        System.out.println(Arrays.stream(s1.split("")).collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey()).collect(Collectors.toList()));
        System.out.println("-------------------------------");

        //Question 3: Java program to find all the unique elements from a given string
        String s2 = "ilovemycountryindia";
        System.out.println(Arrays.stream(s2.split("")).collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet().stream().filter(x->x.getValue()==1).map(x->x.getKey()).collect(Collectors.toList()));
        System.out.println("-------------------------------");

        //Question 4: Java program to find first non-repeating element from a string
        String s3 = "ilovemycountryindia";
        System.out.println(Arrays.stream(s3.split("")).collect(Collectors.groupingBy(x->x, LinkedHashMap::new, Collectors.counting())).entrySet().stream().filter(x->x.getValue()==1).findFirst().map(x->x.getKey()));
        System.out.println("-------------------------------");

        //Question 5: Java program to find second highest number from given array
        int[] arr = {1,2,5,7,3,21};
        System.out.println(Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst());
        System.out.println("-------------------------------");

        //Question 6: Java program to find longest string from given array
        String[] arr1 = {"Aman", "Tarun", "Neha", "Sagar", "Yash", "Harshita"};
        //Approach -1
        System.out.println(Arrays.asList(arr1).stream().sorted((x,y)->y.length()-x.length()).findFirst());
        //Approach -2
        Optional<String> longestString = Arrays.asList(arr1).stream()
                .max(Comparator.comparingInt(String::length));
        longestString.ifPresent(System.out::println);
        System.out.println("-------------------------------");


        //Question 7: Java program to find all elements from array  starting with 1
        int[] arr2 = {1,2,3,4,5,6,7,11};
        System.out.println(Arrays.stream(arr2).boxed().map(x->x + "").filter(x->x.startsWith("1")).collect(Collectors.toList()));
        //.map(x -> x + ""):
        //This operation converts each Integer to a String.
        //x + "" is a shorthand way of converting the integer to a string (using concatenation with an empty string).
        //For example, 1 becomes "1", 11 becomes "11",
        System.out.println("-------------------------------");

        //Question 8:


    }

}
