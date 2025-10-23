package Java8_Assessment;

import java.util.*;
import java.util.stream.Collectors;

public class Third {
    public static void main(String[] args) {
        List<Courses> courses = Arrays.asList(new Courses("Spring", "Framework", 98, 20000),
                new Courses("Spring Boot", "Framework", 95, 18000),
                new Courses("API", "Microservices", 97, 22000),
                new Courses("Microservices", "Microservices", 96, 25000),
                new Courses("FullStack", "FullStack", 91, 14000),
                new Courses("AWS", "Cloud", 92, 21000),
                new Courses("Azure", "Cloud", 99, 21000),
                new Courses("Docker", "Cloud", 92, 20000),
                new Courses("Kubernetes", "Cloud", 91, 20000));
        //System.out.println(courses);

        //Question 1: Write a program to check if all courses have review score>95
        courses.stream().filter(x->x.getReviewScore()>95).forEach(x-> System.out.print(x + " "));
        boolean a=courses.stream().allMatch(x-> x.getReviewScore()>95);
        System.out.println(a);

        //Question 2: Sort the courses based on number of students.
        courses.stream().sorted((x,y)->x.getNoOfStudents()-y.getNoOfStudents()).forEach(x -> System.out.print(x + " "));
        System.out.println();

        //Question 3: To get the course with second highest number of students.
        Optional<Courses> courses1 = courses.stream().sorted((x, y)->y.getNoOfStudents()-x.getNoOfStudents()).skip(1).findFirst();
     Courses c=courses1.isPresent()?  courses1.get():courses1.orElseThrow();
        System.out.println(c);

        //Question 4: To find total number of courses whose review score> 95.
       long count = courses.stream().filter(x->x.getReviewScore()>95).count();
        System.out.println(count);

        //Question 5: To filter out all courses with a review score less than 90 and count how many courses meet this criteria.
        courses.stream().filter(x->x.getReviewScore()<90).forEach(x-> System.out.print(x + " "));
        System.out.println();
      long count1 = courses.stream().filter(x->x.getReviewScore()<90).count();
        System.out.println(count1);

        //Question 6: To find first element whose review score >95.
         Optional<Courses> first  = courses.stream().filter(x->x.getReviewScore()>95).findFirst();
        System.out.println(first.get());

        //Question 7: To find total number of courses in each category
       Map<String, Long> map = courses.stream().collect(Collectors.groupingBy(x->x.getCategory(),Collectors.counting()));
        System.out.println(map);

        //Question 8: To group the courses category wise & get the highest review score course of that category.
       Map<String, Optional<Courses>> co= courses.stream().collect(Collectors.groupingBy(x->x.getCategory(),Collectors.maxBy((x, y)-> x.getReviewScore()-y.getReviewScore())));
        System.out.println(co);

        //Question 9: Calculate and print the average review score of all the courses.
        double d = courses.stream().collect(Collectors.averagingDouble(x->x.getReviewScore()));
        System.out.println(d);

        //Questions 10: Use Java 8 streams to increase the review score of each course by 5 and print the updated list of courses.
       courses.stream().peek(x->x.setReviewScore(x.getReviewScore()+5)).forEach(System.out::print);
//        List list = courses.stream().flatMap(x->(x.getReviewScore())).toList();
//        System.out.print(list);
    }
}
