package OOPS;

abstract  class child{
    abstract public void m1();
}

public class Abstract {
    public void m1(){
        System.out.println("overriden method");
    }
    public static void main(String[] args) {
        Abstract a = new Abstract();
        a.m1();
    }
}
