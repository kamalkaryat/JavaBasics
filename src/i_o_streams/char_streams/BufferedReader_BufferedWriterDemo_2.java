package i_o_streams.char_streams;

import java.io.*;

/**
 * Task: Copy line by line to another file
 * BufferedReader & BufferedWriter are used
 */

public class BufferedReader_BufferedWriterDemo_2 {
    public static void main(String[] args) {

        System.out.println("File I/O Started");

        try(
                BufferedReader bufferedReader= new BufferedReader(
                new FileReader("src/i_o_streams/char_streams/readFile1.txt"));

                BufferedWriter bufferedWriter= new BufferedWriter(
                        new FileWriter("src/i_o_streams/char_streams/writeFile1.txt"));){

            String tmp;
            while((tmp=bufferedReader.readLine()) != null){          // read 1 line at a time
                bufferedWriter.write(tmp);                          // write 1 line at a time
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("error while doing i/o in file using char streams");
            throw new RuntimeException(e);
        }

        System.out.println("File I/O End");
    }
}
