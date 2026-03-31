package design_patterns.open_closed_principle.solution;

public class UberBooking implements Booking{
    @Override
    public void book() {
        System.out.println("Uber is Booked");
    }
}
