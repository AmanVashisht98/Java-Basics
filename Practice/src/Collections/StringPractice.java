package Collections;

public class StringPractice {
    public static void main(String[] args) {
        String s1= "Aman";
        String s2="Aman";
        String s3= new String("Aman");

        //== always compares the reference not the data/value
        System.out.println(s1==s2); //true, as reference for both s1 and s2 will be same
        System.out.println(s1==s3); //false, as reference for s1 and s3 will be different
        System.out.println(s2==s3); //false, as reference for s2 and s3 will be different

        System.out.println("-------------------------------------");

        //equals is overriden for string class so it compares the data/value not the reference
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equals(s3)); //true
        System.out.println(s2.equals(s3)); //true

        System.out.println("-------------------------------------");

        //hashcode is overriden for string class so it generates hascode based on data/value not the reference
        System.out.println(s1.hashCode()==s2.hashCode()); //true
        System.out.println(s1.hashCode()==s3.hashCode()); //true
        System.out.println(s2.hashCode()==s3.hashCode()); //true

    }
}
