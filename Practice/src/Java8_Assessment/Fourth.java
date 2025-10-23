package Java8_Assessment;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Fourth {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(111, 234, 567, 127, 324, 198);

        //Question 1: Find all numbers starting with ‘1’ using stream API.
        list.stream().filter(x->String.valueOf(x).startsWith("1")).forEach(x-> System.out.print(x + " "));
        System.out.println();
       List l= list.stream().filter(x->String.valueOf(x).startsWith("1")).toList();
        System.out.println(l);

       String string="howaareyouDoing";
        Set<Character> vowels =new HashSet<>(Arrays.asList('a','e','i','o','u','A'));

       //Question 2: Write the code to display the vowels present in the string and also display the number of vowels present in the string.
        List<String> l1 = Arrays.asList(string.split(""));


      List vo=  string.chars().mapToObj(c-> (char)c).filter(x-> vowels.contains(x)).toList();

        System.out.println(vo);
        long c1=vo.stream().count();
        System.out.println(c1);


      long count=  string.chars().mapToObj(c->(char) c).filter(x->vowels.contains(x))
                .peek(x-> System.out.print(x +" ,")).count();
        System.out.println(count);


        //Question 3: Write the code to find the frequency of each character in the string.
      Map<Character, Long> m = string.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(m);
    }
}
