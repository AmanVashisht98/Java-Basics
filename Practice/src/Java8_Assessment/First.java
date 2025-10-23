package Java8_Assessment;

import java.util.Arrays;
import java.util.List;

public class First {
    public static void main(String[] args) {

        //Question 1: Find the sum of all elements of arraylist
        List<Integer> list= Arrays.asList(1, 33, 22, 52, 56, 21, 90, 3, 4, 4, 5);
        // Method 1
       int s = list.stream().reduce(0,(x,y)->x+y);
        System.out.println(s);
        //Method 2
        int s1 = list.stream().reduce(0, Integer::sum);
           // System.out.println(s1);

       //Question 2 : Find sum of all odd numbers of arraylist
       int s3 = list.stream().filter(x->x%2!=0).reduce(0,(x,y)->x+y);
        System.out.println(s3);

        //Question 3 : Square of all even numbers in the list
         List s5 = list.stream().filter(x->x%2==0).map(n -> n*n).toList();
        System.out.println(s5);

        //Question 4 : Find the maximum element in the list
        //Method 1
       int max= list.stream().max((x,y)->x.compareTo(y)).get();
       //Method 2
        int max1= list.stream().max((x,y)->x-y).get();
        //Method 3
        int max2= list.stream().max(Integer::compareTo).get();
        System.out.println(max1);

       // Question 5 : Sort the arraylist in descending order
        //Method 1
        List desc = list.stream().sorted((x,y)->y-x).toList();
        //Method 2
        List desc1 = list.stream().sorted().toList().reversed();
        //Method 3
        list.stream().sorted().toList().reversed().forEach(x-> System.out.print(x + " "));
        System.out.println();
        System.out.println(desc);
        System.out.println(desc1);

        //Question 6: Find the second largest number from the arraylist
      int i=  list.stream().sorted((x,y)->y-x).skip(1).findFirst().get();
        System.out.println(i);

        //Question 7: Print the values from arraylist which do not have duplicates in list
        //list.stream().
    }
}
