package streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderedMapValueBasedSortingUsingStream7 {
    public static void main(String[] args) {
        Map<String, Integer> map= new LinkedHashMap<>();
        String[] fruits= {"Banana", "Apple", "Mango", "Grapes" ,"Grapes", "Peach", "Apple" ,"Apple", "Mango"};

        map= Arrays.stream(fruits).collect(Collectors
                .toMap(s-> s, s -> 1, Integer::sum));

        OrderedMapValueBasedSortingUsingStream7 instance= new OrderedMapValueBasedSortingUsingStream7();

        //Approach-1
        //instance.sortingApproach1(map);

        //Approach-2
        instance.sortingApproach2(map);

        System.out.println();
        System.out.println("After Sorting");
        map.forEach((f, v) -> System.out.println("fruit: "+f+", rating: "+v));

    }

    public void sortingApproach1(Map<String, Integer> map){
        map.entrySet().stream()
                //<T, T>comparingByVallue() comparator tells sorted() to compare entries based on values not keys
                //reversed() comparator tells to sort in descending order
                .sorted(Map.Entry.<String, Integer> comparingByValue().reversed())
                .toList()
                .forEach(e ->{
                    //remove the element before inserting it in correct order
                    map.remove(e.getKey());
                    map.put(e.getKey(), e.getValue());
                });
    }

    public void sortingApproach2(Map<String, Integer> map){

        map.entrySet().stream()
                //passing a comparator to sorted(). comparing e2 with e1 sort it in descending order
                .sorted((e1, e2) ->
                        e2.getValue().compareTo(e1.getValue()))
                .toList()
                .forEach(e ->{
                    map.remove(e.getKey());
                    map.put(e.getKey(), e.getValue());
                });
    }
}
