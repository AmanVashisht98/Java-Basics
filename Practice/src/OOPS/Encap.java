package OOPS;

public class Encap {
    private String name;
    private int age;

    Encap(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Test{
    public static void main(String[] args) {
        Encap e = new Encap("Aman",25);
        System.out.println(e.getName());
        System.out.println(e.getAge());
    }
}

