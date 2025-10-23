package OOPS;

public class Poly {
    public static void m1(){
        System.out.println("parent method");
    }
}
class Sub extends Poly{

    public static void m1() {
        System.out.println("OOPS.child method");
    }

    public static void main(String[] args) {
        Poly p = new Poly();
        p.m1();
        Sub s = new Sub();
        s.m1();
        Poly p1 = new Sub();
        p1.m1();

    }
}
