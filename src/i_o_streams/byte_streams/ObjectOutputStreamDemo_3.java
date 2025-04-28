package i_o_streams.byte_streams;
import i_o_streams.byte_streams.model.InvoiceItem;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

/**
 * Object Streams
 * Just as data streams support I/O of primitive data types, object streams support I/O
 * of objects.
 */
public class ObjectOutputStreamDemo_3 {
    static final String dataFile = "src/i_o_streams/byte_streams/invoicedata3.obj";

    public static void main(String[] args) {
        System.out.println("Writing objects with invoice date started...");

        // Sample data
        BigDecimal[] prices = {
                new BigDecimal("19.99"),
                new BigDecimal("9.99"),
                new BigDecimal("15.99"),
                new BigDecimal("3.99"),
                new BigDecimal("4.99")
        };
        int[] units = { 12, 8, 13, 29, 50 };
        String[] descs = {
                "Java T-shirt",
                "Java Mug",
                "Duke Juggling Dolls",
                "Java Pin",
                "Java Key Chain"
        };

        // Create list of InvoiceItem
        List<InvoiceItem> items = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            items.add(new InvoiceItem(prices[i], units[i], descs[i]));
        }

        // Add a date
        Calendar invoiceDate = Calendar.getInstance();

        // Write objects to file
        try (ObjectOutputStream out = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(dataFile)))) {

            out.writeObject(invoiceDate);  // Write invoice date
            out.writeObject(items);        // Write list of invoice items

        } catch (IOException e) {
            System.out.println("!! Error while writing objects to file");
        }

        System.out.println("Writing complete.");
    }
}
