package core.string;

public class StringDemo {
    public static void main(String[] args) {
        /*
         * n1 & n2 pointing same string obj.
         * Reason-->Compiler will create only 1 obj of String CLASS.
         * n1 & n3 pointing different string obj.
         * Reason-->1 string obj is created by Compiler automatically(i.e.n1) but we manually created n3 string obj(i.e.n3).
         *
         * */
        String n1="kamal singh karayat";
        String n2="kamal singh"+" karayat";
        String n3=new String("kamal singh karayat");
        System.out.println("res: "+(n1==n2));//comparing references not values
        System.out.println("res: "+(n1==n3));//comparing references not values
        /*
         * obj_ref.equals(obj_ref)
         * This method is already declared in object class
         * Here it is overridden.
         * */
        System.out.println("res: "+n1.equals(n3));//comparing values of strings.
    }
}
