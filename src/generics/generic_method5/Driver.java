package generics.generic_method5;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        Integer[] intArr= {1,2,5,6,3,3};
        String[] strArray= {"Learning", "Genrics", "In", "Java"};

        System.out.println("Printing the Integer[]");
        printArray(intArr);

        System.out.println("Printing the String[]");
        printArray(strArray);

    }
    public static <T> void printArray(T[] arr){
        for(T v: arr)
            System.out.print(v+" ");
        System.out.println();
    }
}
