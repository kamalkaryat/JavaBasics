package design_patterns.open_closed_principle.solution;

public class RapidoBooking implements Booking {

    @Override
    public void book() {
        System.out.println("Rapido is Booked");
    }
}
