package i_o_streams.byte_streams.model;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

public class InvoiceItem implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final BigDecimal price;
    private final int quantity;
    private final String description;

    public InvoiceItem(BigDecimal price, int quantity, String description) {
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public String toString() {
        return quantity + " x " + description + " @ $" + price;
    }
}
