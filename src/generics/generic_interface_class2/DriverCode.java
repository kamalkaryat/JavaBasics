package generics.generic_interface_class2;

public class DriverCode {
    public static void main(String[] args) {

        // Generic Interface but not generic class
        System.out.println("Generic Interface but not generic class");
        StringContainer sc= new StringContainer();
        sc.add("GenericsDemo");
        System.out.println("String val: "+sc.get());

        //Generic Class as well as generic interface
        System.out.println("Generic Class as well as generic interface");

        //Integer Container
        GenericContainerClass<Integer> gc= new GenericContainerClass<>();
        gc.add(111);
        System.out.println("Int Val: "+gc.get());

        //String Container
        GenericContainerClass<String> gsc= new GenericContainerClass<>();
        gsc.add("Generics Demo");
        System.out.println("String Val: "+gsc.get());
    }
}
