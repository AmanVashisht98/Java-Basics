package Collections_Revision;

public class Employee {
    private String name;
    private Double salary;
    private int  empId;
    private String department;

    public Employee(String name, Double salary, String department, int empId) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", empId=" + empId +
                ", department='" + department + '\'' +
                '}';
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
