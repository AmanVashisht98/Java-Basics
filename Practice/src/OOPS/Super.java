package OOPS;

public class Super {
    public static void m1(){
        System.out.println("parent method");
    }
}
class Subb extends Super{

    public static void m1() {
        System.out.println("OOPS.child method");
    }

    public static void main(String[] args) {
        Super p = new Super();
        p.m1();
        Subb s = new Subb();
        s.m1();
        Super p1 = new Subb();
        p1.m1(); //method hiding as we cannot override static methods so parent class method is executed

    }
}

