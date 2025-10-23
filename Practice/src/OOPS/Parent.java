package OOPS;

public class Parent {

    public void m1(){
        System.out.println("parent method");
    }
}
class Child extends Parent {
    public void m2(){
        System.out.println("OOPS.child method");
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.m1(); //parent method
        c.m2(); //OOPS.child method
        Parent p = new Parent();
        p.m1(); //parent method
        //p.m2(); compile time error as we cannot call OOPS.child method using parent reference
        Parent p1 = new Child();
        p1.m1(); //parent method
        //p1.m2(); //   compile time error as we cannot call OOPS.child method using parent reference
    }
}


