package design_patterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRegistry {
    private static Map<String, Prototype> registry = new HashMap<>();

    static {
        registry.put("Developer", new Employee("", "Developer", "IT"));
        registry.put("Manager", new Employee("", "Manager", "Management"));
    }

    public static Prototype getEmployee(String type) throws CloneNotSupportedException {
        return registry.get(type).clone();
    }
}
