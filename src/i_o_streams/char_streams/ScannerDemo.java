package i_o_streams.char_streams;

import java.io.*;
import java.util.Scanner;

/**
 * Read data from a file using Scanner
 * Scanner is used
 */

public class ScannerDemo {
    public static void main(String[] args) {

        System.out.println("File I/O Started");

        try(
                Scanner scanner= new Scanner(new BufferedReader(
                        new FileReader("src/i_o_streams/char_streams/readFile1.txt")));){

                //scanner.useDelimiter("\\s");
            scanner.useDelimiter("\n");
            while(scanner.hasNext()){
                System.out.println(scanner.next());         //read token(word) by token
            }
        } catch (IOException e) {
            System.out.println("error while doing i/o in file using char streams");
            throw new RuntimeException(e);
        }

        System.out.println("File I/O End");
    }
}

