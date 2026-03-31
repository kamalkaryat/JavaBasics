package i_o_streams.byte_streams;

import java.io.*;

/**
 * Helps in performing I/O operation on primitive data types & strings
 * Task: Read primitive data from a file
 * DataInputStream is used
 * NOTE: Detect EOF by catching the EOFException instead of testing for a invalid return value
 * Problem:
 * Use floating point to represent the currency which cannot represent values like 0.1
 * For which we have to use BigDecimal, but it is an object which DataStream doesn't support
 */

public class DataInputStreamDemo_2 {
    static final String dataFile = "src/i_o_streams/byte_streams/invoicedata2";

    public static void main(String[] args) throws IOException {
        double price;
        int unit;
        String desc;
        double total = 0.0;

        System.out.println("Reading primitive data from a file started");

        try(DataInputStream in = new DataInputStream(new BufferedInputStream(
                new FileInputStream(dataFile)));){

            //Reading primitive values from a file
            while (true) {
                price = in.readDouble();
                unit = in.readInt();
                desc = in.readUTF();
                System.out.format("You ordered %d" + " units of %s at $%.2f%n",
                        unit, desc, price);
                total += unit * price;
            }
        } catch (EOFException e) {
            System.out.println("Reached the EOF");
        }
    }
}
