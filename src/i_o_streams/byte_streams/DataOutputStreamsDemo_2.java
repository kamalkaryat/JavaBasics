package i_o_streams.byte_streams;

import java.io.*;

/**
 * Helps in performing I/O operation on primitive data types & strings
 * Task: Write primitive data to a file
 * DataOutputStreams is used
 */

public class DataOutputStreamsDemo_2 {
    static final String dataFile = "src/i_o_streams/byte_streams/invoicedata2";

    static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
    static final int[] units = { 12, 8, 13, 29, 50 };
    static final String[] descs = {
            "Java T-shirt",
            "Java Mug",
            "Duke Juggling Dolls",
            "Java Pin",
            "Java Key Chain"
    };

    public static void main(String[] args) {
        System.out.println("Writing primitive data to a file started");
        try( DataOutputStream out = new DataOutputStream(new BufferedOutputStream(
                new FileOutputStream(dataFile)));){

            //Write primitives to a file
            for (int i = 0; i < prices.length; i ++) {
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);
            }
        } catch (IOException e) {
            System.out.println("!! Error while writing primitive data to a file started");
            throw new RuntimeException(e);
        }
        System.out.println("Writing primitive data to a file end");
    }
}
