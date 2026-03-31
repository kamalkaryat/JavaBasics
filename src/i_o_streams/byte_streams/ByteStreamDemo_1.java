package i_o_streams.byte_streams;

import java.io.*;
import java.util.Scanner;

public class ByteStreamDemo_1 {
    public static void main(String[] args){
        System.out.println("Enter Some Text: ");
        Scanner sc= new Scanner(System.in);

        String data= sc.nextLine();

        try(OutputStream os= new FileOutputStream("src/i_o_streams/byte_streams/data.txt");) {
            for(char ch: data.toCharArray()){
                os.write(ch);
            }
        }catch (IOException e) {
            System.err.println("Error while writing the file");
            throw new RuntimeException(e);
        }

        System.out.println("Now Reading From the new created file");
        try(InputStream is= new FileInputStream("src/i_o_streams/byte_streams/data.txt");){
            int ch;
            while((ch= is.read()) != -1){
                System.out.print((char)ch);
            }
        } catch (IOException e) {
            System.err.println("Error while reading the file");
            throw new RuntimeException(e);
        }

    }
}
