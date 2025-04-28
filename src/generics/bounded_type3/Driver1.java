package generics.bounded_type3;

public class Driver1 {
    public static void main(String[] args) {
        NoContainerClass1 nc= new NoContainerClass1();
        nc.add(1223);
        System.out.println(nc.get());
    }
}
