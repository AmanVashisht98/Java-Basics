package Java8_Basics;

public class B implements  A{


    @Override
    public void m1() {
        System.out.println("imp");
    }

    public static void main(String[] args) {
        A a=new B();
        a.m1();


    }
}
