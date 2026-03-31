package design_patterns.creational.prototype;

public class Employee implements Prototype{
    private String name;
    private String role;
    private String department;

    public Employee(String name, String role, String department) {
        this.name = name;
        this.role = role;
        this.department = department;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (Prototype) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", role=" + role + ", department=" + department + "]";
    }

}
