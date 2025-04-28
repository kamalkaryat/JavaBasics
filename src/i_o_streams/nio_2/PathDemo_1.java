package i_o_streams.nio_2;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * A Path instance contains the information used to specify the location of a file or directory
 */
public class PathDemo_1 {
    public static void main(String[] args) {
        Path p1= Paths.get("/test/dir1/dir2");
        Path p2 = Paths.get(System.getProperty("user.home"),"logs", "foo.log");
        Path p3 = FileSystems.getDefault().getPath("\\user\\kamal");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());

        Path path = Paths.get("C:\\home\\joe\\foo");

        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0,2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());

        //Convert the path to a string which can be opened in browser
        Path p4 = Paths.get("src/i_o_streams/Readme.md");
        // Result is file:///home/logfile
        System.out.format("toUri: %s%n", p4.toUri());
    }
}
