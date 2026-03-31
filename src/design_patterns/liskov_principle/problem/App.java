package design_patterns.liskov_principle.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * This kind of code will always break wherever it is used
 * Following the Liskov Principle but for the BiCycle the hasEngine()
 * method returns 'null' & calling a method on null will give NullPointerException
 * & break code at runtime
 */
public class App {
    public static void main(String[] args) {
        List<Vehicle> vehicles= new ArrayList<>();
        vehicles.add(new MotorCycle());
        vehicles.add(new Car());
        vehicles.add(new ByCycle());

        //Business Logic
        for(Vehicle v: vehicles)
            System.out.println(v.hasEngine().toString());       //NullPointerException for ByCycle
    }
}
