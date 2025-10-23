package OOPS;

public class Lambda_Function {


    public static void main(String[] args) {
        Interf i = (n) -> System.out.println(n*n); //using lambda function
        i.square(2);


        Interf i3= n ->{                          //using anonymous class
                System.out.println(n*n);

        };
        i3.square(2);


    }
}
