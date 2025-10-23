package Java8_Revision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example_Questions {
    public static void main(String[] args) {

        //Question 1: Print all elements of a list using streams forEach loop
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list2.stream().forEach(x-> System.out.print(x + " "));
        System.out.println();
        System.out.println("----------------------------------------------------------");

        //Question 2: Find numbers divisible by 2, then multiply them by 2, then remove duplicates, then skip first element, then limit the result by 2, then sort those numbers in descending.
        List<Integer> list1=  Arrays.asList(1,2,3,4,6,5,7,8,9,10,11,12,12);
        List<Integer> finalResult = list1.stream().filter(x -> x % 2 == 0).map(x -> x*2).distinct().skip(1).limit(2).sorted((a, b) -> b - a).collect(Collectors.toList());
        long count = list1.stream().filter(x -> x % 2 == 0).map(x -> x / 2).distinct().skip(1).limit(2).sorted((a, b) -> b - a).count();
        System.out.println("number of elements: " + count);
        System.out.println(finalResult);
        System.out.println("----------------------------------------------------------");

        //Question 3: Filter the string where length>3, then get distinct strings(names)
        List<String> names = Arrays.asList("Aman", "Tarun", "Neha", "Sagar", "Yash", "Aman");
        List<String> output = names.stream().filter(x -> x.length() > 3).distinct().collect(Collectors.toList());
        long count1 = names.stream().filter(x -> x.length() > 3).distinct().count();
        System.out.println("number of elements: " + count1);
        System.out.println(output);
        System.out.println("----------------------------------------------------------");

        //Question 4: Squaring and sorting(descending) and summing numbers of a list
        System.out.println("suare and sorted: " + list1.stream().map(x->x*x).sorted((a,b)->b-a).toList());
        System.out.println("square and sum: " + list1.stream().map(x->x*x).reduce((x,y)->x+y));
        System.out.println("----------------------------------------------------------");

        //Question 5: Counting occurence of a character
        String sentence = "Hello world";
        long count2 = sentence.chars().filter(x -> x == 'l').count();
        System.out.println(count2);
        System.out.println("----------------------------------------------------------");

        //Question 6: Convert a list of strings into a single string and convert them into upper case
        List<String> sentences = Arrays.asList("Hello world", "Java stream in powerful", "flatmap is useful");
        List<String> list = sentences.stream().flatMap(x -> Arrays.stream(x.split(" "))).map(x -> x.toUpperCase()).toList();
        System.out.println(list);
        System.out.println("----------------------------------------------------------");

        //Question 7: Collecting names by length
        List<String> list3 = Arrays.asList("Aman", "Tarun", "Neha", "Sagar", "Yash");
        System.out.println(list3.stream().collect(Collectors.groupingBy(x->x.length())));
        System.out.println("----------------------------------------------------------");

        //Question 8: counting word occurence
        String occurence = "hello world hello world java";
        System.out.println(Arrays.stream(occurence.split(" ")).collect(Collectors.groupingBy(x->x,Collectors.counting())));
        System.out.println("----------------------------------------------------------");

        //Question 9: Divide a list of integers into even and odd
        List<Integer> list4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println(list4.stream().collect(Collectors.partitioningBy(x->x%2==0)));
        System.out.println("----------------------------------------------------------");

        //Question 10: Summing values in a map
        HashMap<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 30);
        System.out.println(items.values().stream().reduce((x,y)->x+y));
        System.out.println("----------------------------------------------------------");


        //===============


    }
}
