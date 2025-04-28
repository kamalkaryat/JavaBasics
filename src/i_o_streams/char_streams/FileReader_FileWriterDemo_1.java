package i_o_streams.char_streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Task: Copy Char by Char to another file
 * FileReader & FileWriter are used
 */

public class FileReader_FileWriterDemo_1 {
    public static void main(String[] args) {

        System.out.println("File I/O Started");

        try(FileReader fileReader= new FileReader("src/i_o_streams/char_streams/readFile1.txt");
            FileWriter fileWriter= new FileWriter("src/i_o_streams/char_streams/writeFile1.txt");){
            int tmp;
            while((tmp=fileReader.read()) != -1){
                    fileWriter.write(tmp);
            }
        } catch (IOException e) {
            System.out.println("error while doing i/o in file using char streams");
            throw new RuntimeException(e);
        }

        System.out.println("File I/O Endedf");
    }
}
