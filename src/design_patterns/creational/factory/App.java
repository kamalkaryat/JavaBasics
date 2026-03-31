package design_patterns.creational.factory;

public class App {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle car = factory.getVehicle("CAR");
        car.drive();

        Vehicle bike = factory.getVehicle("BIKE");
        bike.drive();
    }
}

// Product interface
interface Vehicle {
    void drive();
}

// Concrete product
class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Driving a car...");
    }
}

// Concrete product
class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Riding a bike...");
    }
}

// Factory
class VehicleFactory {
    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) return null;

        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }

        return null;
    }
}