package i_o_streams.char_streams;

import java.io.*;

/**
 * Task: Copy data from 1 file & write into another file in a formatted way like
 * printf(), println(), print() function
 * BufferedReader & PrintWriter are used
 */

public class PrintWriterDemo_3 {
    public static void main(String[] args) {

        System.out.println("File I/O Started");
        final String title= "PrintWriter Demo";

        try(
                BufferedReader bufferedReader= new BufferedReader(
                        new FileReader("src/i_o_streams/char_streams/readFile1.txt"));

                PrintWriter printWriter= new PrintWriter(
                        new FileWriter("src/i_o_streams/char_streams/writeFile1.txt"));){

            String tmp;
            printWriter.printf("%s", title);        //usage of printf() with PrintWriter
            printWriter.println();                  //usage of println() with PrintWriter

            while((tmp=bufferedReader.readLine()) != null){          // read 1 line at a time
                printWriter.println(tmp);                    // write 1 line at a time but in a formatted way
            }
        } catch (IOException e) {
            System.out.println("error while doing i/o in file using char streams");
            throw new RuntimeException(e);
        }

        System.out.println("File I/O End");
    }
}

