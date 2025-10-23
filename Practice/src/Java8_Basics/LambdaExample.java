package Java8_Basics;

public class LambdaExample {

    public static void main(String[] args) {
        A a=  ()->{
            System.out.println("imp m1");
        };
        a.m1();
    }

}
