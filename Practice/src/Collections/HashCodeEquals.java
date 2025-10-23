package Collections;

import java.util.HashMap;
import java.util.Objects;

public class HashCodeEquals {

    public static void main(String[] args) {

        Student s1 = new Student("Aman", 1);
        Student s2= new Student("Shivam", 2);
        Student s3 = new Student("Vikram", 3);
        Student s4 = new Student("Aman", 1);

        HashMap<Student, String> map =  new HashMap<>();
        map.put(s1,"Backend Developer"); //hashcode 1
        map.put(s2,"Full Stack Developer"); //hashcode 2
        map.put(s3, "Java Developer"); //hashcode 3
        map.put(s4,"Java Developer"); //hashcode 4

        System.out.println(map.get(s1));
        System.out.println(map.get(s4));
        System.out.println(map.size());

    }
}

 class Student{
    private String name;
    private int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

     @Override
     public boolean equals(Object o) {
         if (o == null || getClass() != o.getClass()) return false;
         Student student = (Student) o;
         return roll == student.roll && Objects.equals(name, student.name);
     }

     @Override
     public int hashCode() {
         return Objects.hash(name, roll);
     }
 }
