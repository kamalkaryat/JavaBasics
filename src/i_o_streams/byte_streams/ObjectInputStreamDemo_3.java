package i_o_streams.byte_streams;

import i_o_streams.byte_streams.model.InvoiceItem;

import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class ObjectInputStreamDemo_3 {
    static final String dataFile = "src/i_o_streams/byte_streams/invoicedata3.obj";

    public static void main(String[] args) {
        System.out.println("Reading invoice data...");

        try (ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream(dataFile)))) {

            // Read the date
            Calendar invoiceDate = (Calendar) in.readObject();

            // Read the list of invoice items
            List<InvoiceItem> items = (List<InvoiceItem>) in.readObject();

            // Format and print
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println("Invoice Date: " + sdf.format(invoiceDate.getTime()));
            System.out.println("Invoice Items:");

            for (InvoiceItem item : items) {
                System.out.println("  - " + item);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("!! Error reading invoice data");
            e.printStackTrace();
        }

        System.out.println("Invoice reading complete.");
    }
}
