package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LazyEvaluationDemo4 {
    public static void main(String[] args) {
        Demo.lazyEvalDemo();
    }
}
class Demo{
    private static final List<String> names= Arrays.asList("Alice", "Bob", "Charlie", "David");
    public static void lazyEvalDemo(){
        Stream<String> filteredNamesStream= names.stream().filter(name ->{
            System.out.println("Filtering: "+name);
            return name.length() > 3;
        });

        System.out.println("Before Filtering");
        List<String> filteredNamesList= filteredNamesStream.toList();

        System.out.println("After Filtering");
        System.out.println(filteredNamesList);
    }
}