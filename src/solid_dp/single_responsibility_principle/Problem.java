package solid_dp.single_responsibility_principle;

public class Problem { }

/**
 * Doing multiple jobs(3)
 * If the way we print changes (e.g., now we print to PDF), we’ll have to touch this class —
 * even if the calculation logic hasn't changed.
 * violates SRP because it has multiple reasons to change.
 */

class Invoice {
    public void calculateTotal() { /* calculates price */ }
    public void printInvoice() { /* prints to printer */ }
    public void saveToDatabase() { /* saves to DB */ }
}
