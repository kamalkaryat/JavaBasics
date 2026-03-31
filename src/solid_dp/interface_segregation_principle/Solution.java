package solid_dp.interface_segregation_principle;

public class Solution { }


/**
 * Human implements both Workable and Eatable.
 * Robot only implements Workable, and it’s not forced to eat.
 * Now each class only deals with what it actually needs — nothing extra.
 */
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Humann implements Workable, Eatable {
    public void work() {
        System.out.println("Human working...");
    }

    public void eat() {
        System.out.println("Human eating...");
    }
}

class Robott implements Workable {
    public void work() {
        System.out.println("Robot working...");
    }
}

