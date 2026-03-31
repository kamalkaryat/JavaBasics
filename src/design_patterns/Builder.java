package design_patterns;

public class Builder {
    public static void main(String[] args) {
        Employee employee= new Employee.EmployeeBuilder()
                .id(111)
                .name("Kamal Karayat")
                .salary(25000.00)
                .gender('M')
                .build();

        System.out.println(employee);
    }
}

class Employee{
    private int id;
    private String name;
    private double salary;
    private char gender;

    public Employee(EmployeeBuilder builder){
        this.id= builder.id;
        this.name= builder.name;
        this.salary= builder.salary;
        this.gender= builder.gender;
    }

    public static class EmployeeBuilder{
        private int id;
        private String name;
        private double salary;
        private char gender;

        public EmployeeBuilder id(int id){
            this.id= id;
            return this;
        }

        public EmployeeBuilder name(String name){
            this.name= name;
            return this;
        }

        public EmployeeBuilder salary(double salary){
            this.salary= salary;
            return this;
        }

        public EmployeeBuilder gender(char gender){
            this.gender= gender;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }

    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", gender=" + gender +
                '}';
    }
}
