package solid_dp.single_responsibility_principle;

public class Solution { }

/**
 * Each class has just one responsibility.
 * change printing without affecting the calculation or saving logic.
 */
class Invoice_S {
    public void calculateTotal() { /* calculate only */ }
}

class InvoicePrinter {
    public void print(Invoice invoice) { /* print only */ }
}

class InvoiceRepository {
    public void save(Invoice invoice) { /* save only */ }
}
