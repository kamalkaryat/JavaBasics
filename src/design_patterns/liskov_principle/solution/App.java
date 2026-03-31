package design_patterns.liskov_principle.solution;
/*
                        Parent
                       /   |  \
                      c1  c2  c3
 Parent p= new c1()         // must work
 or
 Parent p= new c2()         // must work
 or
 Parent p= new c3()         // must work
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Definition: Code should not break if parent & child objects
 * are swapped with each other
 */
public class App {
    public static void main(String[] args) {
        List<Vehicle> vehicles= new ArrayList<>();
        vehicles.add(new Car());
        vehicles.add(new MotorCycle());
        vehicles.add(new ByCycle());

        List<EngineVehicle> engineVehicles= new ArrayList<>();
        engineVehicles.add(new Car());
        engineVehicles.add(new MotorCycle());

        //Business Logic
        /*
         * EngineVehicle always has the hasEngine() functionality.
         * This code will not break
         */
        for(EngineVehicle ev: engineVehicles)
            System.out.println(ev.hasEngine().toString());
    }
}
