package solid_dp.opened_closed_principle;

public class Solution { }

/**
 * to add a new customer type (e.g., VipDiscount), we just create a new class.
 * No need to change DiscountCalculator at all — it's closed for modification.
 * The system is open to new types without touching existing code
 */
interface Discount {
    double getDiscount();
}

class RegularDiscount implements Discount {
    public double getDiscount() {
        return 0.1;
    }
}

class PremiumDiscount implements Discount {
    public double getDiscount() {
        return 0.2;
    }
}

class DiscountCalculator_S {
    public double calculate(Discount discount) {
        return discount.getDiscount();
    }
}
