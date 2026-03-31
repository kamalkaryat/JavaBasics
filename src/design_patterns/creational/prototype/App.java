package design_patterns.creational.prototype;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee dev1 = (Employee) EmployeeRegistry.getEmployee("Developer");
        dev1.setName("John Doe");

        Employee dev2 = (Employee) EmployeeRegistry.getEmployee("Developer");
        dev2.setName("Jane Smith");

        System.out.println(dev1);
        System.out.println(dev2);
    }
}
