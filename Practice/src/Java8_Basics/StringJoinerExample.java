package Java8_Basics;

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {

        StringJoiner join=new StringJoiner(",","[","}");
        join.add("hello");
        join.add("world");

        System.out.println(join);
    }
}
