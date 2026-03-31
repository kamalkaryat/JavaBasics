package solid_dp.interface_segregation_principle;

public class Problem { }

/**
 * The Robot is forced to implement eat(), even though it shouldn’t eat.
 * This creates confusion, unused code, and possible runtime errors.
 * It violates ISP because the interface has more than one responsibility.
 */

interface Worker {
    void work();
    void eat();
}

class Human implements Worker {
    public void work() {
        System.out.println("Human working...");
    }

    public void eat() {
        System.out.println("Human eating...");
    }
}

class Robot implements Worker {
    public void work() {
        System.out.println("Robot working...");
    }

    public void eat() {
        throw new UnsupportedOperationException("Robots don't eat!");
    }
}

