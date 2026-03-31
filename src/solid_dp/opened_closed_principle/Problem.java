package solid_dp.opened_closed_principle;

public class Problem { }

/**
 * If we want to add a new customer type (e.g., “VIP”), we have to change this class.
 * Every time a new type is added, we touch old working code — which might break it.
 * Violates Open/Closed Principle because the class is not closed for modification.
 */
class DiscountCalculator {
    public double calculate(String customerType) {
        if (customerType.equals("Regular")) return 0.1;
        else if (customerType.equals("Premium")) return 0.2;
        return 0;
    }
}
