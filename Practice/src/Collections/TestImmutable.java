package Collections;

import Java8_Basics.A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestImmutable {

    public static void main(String[] args) {
        List<String> li=new ArrayList<>();
        li.add("java");
        li.add("python");

        Student01 student01=new Student01(li);
        List<String> subs = student01.getSubs();
        subs.add("js");
        System.out.println(student01);
    }

}
class Student01{

    private final List<String> subs;

    public Student01(List<String> subs) {
        this.subs = subs;
    }

    public List<String> getSubs() {
        return new ArrayList<>(subs);
    }

    @Override
    public String toString() {
        return "Student01{" +
                "subs=" + subs +
                '}';
    }
}
