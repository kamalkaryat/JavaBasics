package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo6 {
    public static void main(String[] args) {
       CollectorsMethodDemo.toAAAADemo();
        //CollectorsMethodDemo.specificCollectionDemo();
        //CollectorsMethodDemo.summarizingAAA();
        //CollectorsMethodDemo.individualOperation();
        //CollectorsMethodDemo.grouping();
        //CollectorsMethodDemo.partioning();
        //CollectorsMethodDemo.mappingAndCollect();
    }
}

class CollectorsMethodDemo{
    private final static List<Integer> noList= Arrays.asList(1,2,3,4,4,5,5,5,6,6,8,3);
    private static List<String> fruitsList= Arrays.asList("Mango", "Apple", "Pineapple" ,"Pomegranate",
            "DragonFruit", "Litchi", "Papaya", "Banana", "Cherry", "Grapes");

    public static void toAAAADemo() {
        List<Integer> list = noList.stream().collect(Collectors.toList());
        System.out.println("Collector-List: "+list);

        Set<Integer> set = noList.stream().collect(Collectors.toSet());
        System.out.println("Collctor-Set: "+set);

        //toMap(keyParam, valueParam)
        System.out.println(fruitsList.stream()
                .collect(Collectors.toMap(String::toUpperCase, String::length)));

        //toMap(keyParam, valueParam, merge)
        // Merge: Logic what to do when multiple occurrence of a same string is found.

        List<String> flist= Arrays.asList("Apple" ,"Mango", "Banana", "Mango", "Papaya", "Apple");
        System.out.println(flist.stream()
                .collect(Collectors.toMap(k -> k, v-> 1, Integer::sum)));
    }

    public static void specificCollectionDemo() {
        List<Integer> list = Stream.of(1,2,3,4,4,5)
                .collect(Collectors.toCollection(() -> new ArrayList<>()));
        System.out.println("Collector-List: "+list);
    }

    public static void summarizingAAA() {
        //Function of summarizingInd() method param take an i/p & return the same i/p in o/p
        IntSummaryStatistics stats= noList.stream()
                .collect(Collectors.summarizingInt(x -> x));
        System.out.println("Sum: "+stats.getSum());
        System.out.println("Min: "+stats.getMin());
        System.out.println("Max: "+stats.getMax());
        System.out.println("Avg: "+stats.getAverage());
        System.out.println("Count: "+stats.getCount());
    }

    public static void individualOperation() {
        Double avg= noList.stream().collect(Collectors.averagingInt(x -> x));
        Long count= noList.stream().collect(Collectors.counting());
        System.out.println("Avg: "+avg);
        System.out.println("Count: "+count);
    }

    public static void grouping() {
        List<String> words = Arrays.asList("Hello", "World", "Java", "Streams", "Collection");
        System.out.println("List is: "+words);

        System.out.println("Grouping Using Method1: ");
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));

        //Used when some operation is performed on groups
        System.out.println("Grouping Using Method2: ");
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining("|"))));

        //Used when in o/p we need a map object
        System.out.println("Grouping Using Method3: ");
        TreeMap<Integer, Long> treeMap= words.stream().
                collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);
    }

    public static void partioning() {
        System.out.println("Even & Odd List: ");
        System.out.println(noList.stream()
                .collect(Collectors.partitioningBy(n -> n%2 ==0)));
    }

    public static void mappingAndCollect(){
        List<String> namesList= Arrays.asList("Kamal", "Manish", "Harsh", "nitin", "avinash");
        List<String> collect = namesList.stream()
                .collect(Collectors.mapping(String::toUpperCase, Collectors.toList()));
        System.out.println(collect);
    }
}
