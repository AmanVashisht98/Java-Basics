package Java8_Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student student1=new Student("aman", Arrays.asList("java","spring boot"));
        Student student2=new Student("shivam", Arrays.asList("java","Spring boot"));
        Student student3=new Student("vikram", Arrays.asList("py","django"));
        Student student4=new Student("prince", Arrays.asList("py","django"));

        Department department1=new Department("java",Arrays.asList(student1,student2));
        Department department2=new Department("py",Arrays.asList(student3,student4));
        List<Department> deptList=new ArrayList<>();
        deptList.add(department1);
        deptList.add(department2);

        System.out.println(deptList);






    }
}
class Department{
    private String deptName;
    private List<Student> students;

    public Department(String deptName, List<Student> students) {
        this.deptName = deptName;
        this.students = students;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

class Student{
    private String name;
    private List<String> skillsList;

    public Student(String name, List<String> skillsList) {
        this.name = name;
        this.skillsList = skillsList;
    }

    public String getName() {
        return name;
    }

    public List<String> getSkillsList() {
        return skillsList;
    }

    public void setSkillsList(List<String> skillsList) {
        this.skillsList = skillsList;
    }

    public void setName(String name) {
        this.name = name;
    }
}

