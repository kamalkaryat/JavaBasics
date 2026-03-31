package core.wrapper_classes;

public class Demo {
    public static void main(String[] args) {
        /* Here only Integer Wrapper class is declared */

        /* Integer-->class & valueOf(String )-->static member fun
         * valueOf()-->Argument Type-String & Return Type-Returns the reference of a Integer object
         */
        Integer obj=Integer.valueOf("12");

        /* Integer-->class & intValue()-->static member fun
         * intValue()-->Argument Type-Void & Return Type-int.
         * Note-returns the value of a Wrapper class object.
         */
        int var1=obj.intValue();
        System.out.println("Variable1= "+var1);

        /* Integer-->class & valueOf(String )-->static member fun
         * valueOf()-->Argument Type-String & Return Type-int
         */
        int var2=Integer.parseInt("12");
        System.out.println("Variable2= "+var2);

        /* Boxing & unboxing in wrapper class*/
        Integer var=5;	//primitive data type to Integer object
        var+=10;	//Integer object to primitive data type
        System.out.println("\nAfter adding 10 on var=5 is: "+var);
    }
}
