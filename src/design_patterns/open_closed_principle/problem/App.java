package design_patterns.open_closed_principle.problem;

public class App {
    public static void main(String[] args) {
        System.out.println("Existing Features....");
        VehicleBooking vBooking= new VehicleBooking();
        vBooking.booking(Type.UBER);

        System.out.println("New Requirement....");
        vBooking.booking(Type.METRO);
    }
}
