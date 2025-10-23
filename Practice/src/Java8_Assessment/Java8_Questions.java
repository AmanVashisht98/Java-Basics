package Java8_Assessment;
import Java8_Basics.Employee;

import  java.util.*;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
public class Java8_Questions {
    public static void main(String[] args) {

//        Employee e1 = (new Employee("ajay", "development", 70000, 8076026017l));
//        Employee e2 =(new Employee("ajay", "development", 70000, 8076026017l));
//        System.out.println(e1.equals(e2));
//       int h1= e1.hashCode();
//       int h2 = e2.hashCode();
//        System.out.println(h1==h2);

        ArrayList<Employee> e = new ArrayList<Employee>();
        e.add(new Employee("aman", "development", 70000, 8076026017l));
        e.add(new Employee("ajay", "testing", 50000, 8076026019l));
        e.add(new Employee("naman", "devops", 40000, 8076028017l));
        e.add(new Employee("akshay", "testing",30000, 8076096017l));
        e.add(new Employee("hirdesh", "testing", 35000, 8076446017l));


        //Question: Print the salary of all the employees
        List<Double> salary = e.stream().map(Employee::getSalary).collect(Collectors.toList());
        System.out.println(salary);

        //Question: Find the highest paid employee from each department
        e.stream().collect(Collectors.groupingBy(Employee::getDept));;

        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(7);
        al.add(1);
        al.add(5);
        al.add(2);
        al.add(4);

        //Question 1: print all the numbers greater than 2 in sorted order
      al.stream().filter(t -> t>2).sorted().forEach(t-> System.out.println(t));

        //Quetion 2: print all the odd numbers
            al.stream().filter(t -> t%2!=0).forEach(System.out::println);

        //Question 3: Find frequency of occurence of characters in a string
        String s = "amanvashisht";
        Map<String, Long> count = Arrays.stream(s.split("")).collect(
                Collectors.groupingBy(
                        Function.identity(), Collectors.counting()
                )
        );

        System.out.println(count);

        System.out.println("===================");
        //Question 4: List of Employees from each department
        Map<String, List<Employee>> collect = e.stream().collect(Collectors.groupingBy(p -> p.getDept()));
        System.out.println(collect);

       //Question 5: Number of employees in each department
        Map<String, Long> collect1 = e.stream().collect(Collectors.groupingBy(p -> p.getDept(), Collectors.counting()));
        System.out.println(collect1);

        //Question 6: List of Employees from each department with insertion order maintained
        LinkedHashMap<String, List<Employee>> collect2 = e.stream().collect(Collectors.groupingBy(p -> p.getDept(), LinkedHashMap::new, Collectors.toList()));
        System.out.println(collect2);

        //Question 7:Employee having maximum salary from each department
        Map<String, Optional<Employee>> collect3 = e.stream().collect(Collectors.groupingBy(p -> p.getDept(), Collectors.maxBy((o1, o2) -> o1.getSalary().compareTo(o2.getSalary()))));
        System.out.println(collect3);

        List<List<String>> list= new ArrayList<>();
        List<String> list1= new ArrayList<>();
        list1.add("asdfjas");
        list1.add("asda");
        list1.add("asdfas");

        List<String> list2 = new ArrayList<>();
        list2.add("Asdas");
        list2.add("asdas");

        list.add(list1);
        list.add(list2);

        List<String> list3 = list.stream().flatMap(q -> q.stream()).toList();
        System.out.println(list3);


    }
}
