package generics.wildcards_7;

import java.util.Arrays;
import java.util.List;

/**
 * Wildcard: ?
 * Mainly used while performing the read operations
 */
public class WildcardsDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,24,5,2,44,34);
        //reading an array
        display(list);

        //sum up array elements
        System.out.println("Sum of Array Elements: "+sum(list));

        //-------------------Lower Bound----------------------
        //Integer & any super class instance of it can be the ?
        List<? super Integer> list2= Arrays.asList(1,24,5,2,44,34);
        list2.add(123);
        list2.add(null);
    }

    public static void display(List<?> list){
        for(Object o: list)
            System.out.print(o+" ");
        System.out.println();

        //Error: Don't have info what kind of value to add
        //list.add();
    }

    /**
     * //Number & any subclass instance of it can be the ?
     * ? can be Integer, Float, Double, Long. That's why storing the result in double
     * ----------------Upper Bound--------------------
     */
    public static double sum(List<? extends Number> list){
        double sum= 0;

        for (Number n: list)
            sum+= n.doubleValue();
        return sum;
    }
}
