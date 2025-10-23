package Java8_Basics;

public class C {

    public static void main(String[] args) {

       A a= new A(){
            @Override
            public void m1(){
                System.out.println("mi imp an");
            }
        };
       a.m1();
    }
}
