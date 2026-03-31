package design_patterns.open_closed_principle.solution;

public class OlaBooking implements Booking{
    @Override
    public void book() {
        System.out.println("Ola is Booked");
    }
}
