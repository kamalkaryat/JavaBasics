package design_patterns.open_closed_principle.solution;

public class MetroBooking_NewRequirement implements Booking {
    @Override
    public void book() {
        System.out.println("Metro is Booked with new requirement");
    }
}
