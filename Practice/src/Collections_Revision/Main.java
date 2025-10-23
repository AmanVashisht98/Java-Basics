package Collections_Revision;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        
        employeeList.add(new Employee("Chandan",2000000.0,"Development", 101));
        employeeList.add(new Employee("Aman",900000.0,"Development", 102));
        employeeList.add(new Employee("shivam",1100000.0,"Development", 103));
        employeeList.add(new Employee("xyz",20000.0,"Testing", 104));
        employeeList.add(new Employee("abc",3000.0,"Testing", 105));
        employeeList.add(new Employee("eee",900000.0,"Testing", 106));

//       employeeList.stream().collect(Collectors.groupingBy(x -> x.getDepartment(), Collectors.maxBy((x, y) -> x.getSalary().compareTo(y.getSalary()))));

        //Sort the students based on rollNo
//        studentList.sort((a,b)->a.getRollNo()-b.getRollNo());
//        System.out.println(studentList);

        //Custom Sorting (Using Comparator.comparing)
       // Comparator<Student> comparator = Comparator.comparing(x->x.getCgpa());
//        Comparator<Student> comparator = Comparator.comparing(Student::getCgpa).reversed();
//        studentList.sort(comparator);
//        System.out.println(studentList);

        Map<String, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(x -> x.getDepartment()));
        Map<String, List<Employee>> collect1 = collect.entrySet().stream().collect(Collectors.toMap(p -> p.getKey(), x -> x.getValue().stream().sorted((l1, l2) -> -l1.getSalary().compareTo(l2.getSalary())).skip(1).limit(1).toList()));
        System.out.println(collect1);


    }
}
