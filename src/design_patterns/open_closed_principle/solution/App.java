package design_patterns.open_closed_principle.solution;

public class App {
    public static void main(String[] args) {
        System.out.println("Old Features.....");
        //Old Features
        Booking booking= new UberBooking();
        booking.book();

        System.out.println("New Requirement.....");
        //New Requirement
        booking= new MetroBooking_NewRequirement();
        booking.book();
    }
}
