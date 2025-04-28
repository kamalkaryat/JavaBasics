package generics.generic_constructor4;

public class Driver {
    public static void main(String[] args) {
        //Box with Int value
        Box box= new Box(111);

        //OR
        //Box with String value
        //Box strBox= new Box("String Box");
    }
}

class Box {
    //Generic Constructor
    public <T> Box(T val){
        System.out.println("Inside Generic Constructor: "+val);
    }

    //OR
    //Generic Constructor with bounded type
    /*
    public <T extends Integer> Box(T val){
        System.out.println("Inside Generic Constructor with Bounded Type: "+val);
    }
    */
}
