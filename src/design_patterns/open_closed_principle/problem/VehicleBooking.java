package design_patterns.open_closed_principle.problem;

public class VehicleBooking {
    public void booking(Type type){
        switch (type){
            case Type.UBER -> System.out.println("Uber is Booked");
            case Type.OLA -> System.out.println("Ola is Booked");
            case Type.RAPIDO -> System.out.println("Rapido is Booked");

            //Problem: Due to new requirement we need to modify the code
            case Type.METRO -> System.out.println("Metro is Booked");
            default -> System.out.println("Operation Not Allowed");
        }
    }
}
