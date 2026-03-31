package design_patterns.liskov_principle.problem;

/**
 * ByCycle doesn't support engine that why it is returning null
 */
public class ByCycle extends Vehicle{
    @Override
    public Boolean hasEngine() {        //returning a boolean object not value
        return null;
    }
}
