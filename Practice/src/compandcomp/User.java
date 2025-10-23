package compandcomp;

public class User implements Comparable<User>{
    private int id;
    private String name;
    private int age;
    private double height;
    private long phone;

    public User(double height, int age, int id, String name, long phone) {
        this.height = height;
        this.age = age;
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    @Override
    public int compareTo(User o) {
        return this.age-o.age;
    }

    @Override
    public String toString() {
        return height + " " + age + " " + id + " " + name + " " + phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
