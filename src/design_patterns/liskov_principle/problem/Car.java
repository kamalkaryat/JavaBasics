package design_patterns.liskov_principle.problem;

public class Car extends Vehicle{
    @Override
    public int getNoOfWeels() {
        return 4;
    }
}
