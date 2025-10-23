package Java8_Basics;


public class Employee
{
    private String name;
    private String dept;
    private Double salary;
    private long phone;

    public Employee(String name, String dept, double salary, long phone){
        this.name=name;
        this.dept=dept;
        this.salary=salary;
        this.phone=phone;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public String getDept() {
        return dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
//    public int hashCode() {
//        return (int) this.phone;
//    }

//    @Override
//    public boolean equals(Object obj) {
//        Employee e=(Employee) obj;
//        return this.getName().equals(e.getName());
//    }

    @Override
    public String toString() {
        return name + " " + dept + " " + salary;
    }







}
