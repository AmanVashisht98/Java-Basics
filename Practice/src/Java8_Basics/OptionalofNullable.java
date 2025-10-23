package Java8_Basics;
import java.util.Optional;

public class OptionalofNullable {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("First Name");
//        Optional<String> firstName = Optional.of(sc.next());
//        System.out.println("Second Name");
//        Optional<String> lastName = Optional.ofNullable(sc.next());
//        System.out.println(firstName + " " + lastName);

        String s=null;
        Optional<String> opt=Optional.ofNullable(s);
        System.out.println(opt.isEmpty());
    }

}
