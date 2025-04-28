package generics.problems1;

import java.util.ArrayList;

/**
 * Problems:
 * 1- Type safety
 * 2- Manual Casting
 */
public class Problem_1 {
    public static void main(String[] args) {
        ArrayList list= new ArrayList();
        list.add("Generics");
        list.add(10);
        list.add(45.23);
        list.add('a');

        //2- Manual Casting
        String strVal= (String) list.get(0);
        int intVal= (int) list.get(1);
        double doubleVal= (double) list.get(2);
        char charVal= (char) list.get(3);

        //1- Type Safety Problem
        //Program crash cases
        int intValCrash= (int) list.get(0);

        //Solutions: Generics
        ArrayList<Integer> newList= new ArrayList<>();
        //newList.add("Generics");          Only store int values
    }
}
