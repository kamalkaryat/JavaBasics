package design_patterns.liskov_principle.solution;

public class Car extends EngineVehicle {
    @Override
    public int getNoOfWeels() {
        return 4;
    }
}
