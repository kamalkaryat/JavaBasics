package i_o_streams.nio_2;

import java.io.IOException;
import java.nio.file.*;

/**
 * File class offers a rich set of static methods for reading, writing, and manipulating files
 * and directories. The Files methods work on instances of Path objects
 * - Atomic Operations: Operation that cannot be interrupted or partially performed.
 * - Glob: Similar to regex
 * An asterisk, *, matches any number of characters (including none).
 * Two asterisks, **, works like * but crosses directory boundaries. This syntax is generally used for matching complete paths.
 * A question mark, ?, matches exactly one character.
 * Braces specify a collection of subpatterns
 */
public class FileOperationsDemo_2 {
    public static void main(String[] args) throws IOException {

        //1- Checking File Accessibility
        //System.out.println("Is file Regular, Readable & Executable: "+fileAccessibility());

        //2- Check Two Path are same or not
        //System.out.println("Check Two files are same or not: "+isSameFileDemo());

        //3- Delete File or Dir
        deleteFileOrDir();
    }
    public static boolean fileAccessibility(){
        Path path= Paths.get("src/i_o_streams/basics.png");
        return Files.isRegularFile(path) &
                Files.isReadable(path) & Files.isExecutable(path);
    }

    public static boolean isSameFileDemo() throws IOException {
        Path p1= Paths.get("src/i_o_streams/basics.png");
        Path p2= Paths.get("src/i_o_streams/Readme.md");
        return Files.isSameFile(p1, p2);
    }

    public static void deleteFileOrDir(){
        //create the file if doesn't exists yet
        Path path= Paths.get("src/i_o_streams/char_streams/writeFile1.txt");
        try {
            System.out.println("File Deletion starts");
            Files.delete(path);
            System.out.println("File Deletion ends");
        } catch (NoSuchFileException x) {
            System.err.format("%s: no such" + " file or directory%n", path);
        } catch (DirectoryNotEmptyException x) {
            System.err.format("%s not empty%n", path);
        } catch (IOException x) {
            // File permission problems are caught here.
            System.err.println(x);
        }
    }
}
