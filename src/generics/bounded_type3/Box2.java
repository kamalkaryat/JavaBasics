package generics.bounded_type3;

// public class extends Class1 implements interface1, interface2{}
// public class Box<T extends Printable & MyNumber>             Invalid

public class Box2<T extends MyNumber2 & Printable2>{
    private final T item;

    public Box2(T item) {
        this.item = item;
    }

    public void display(){
        item.print();
    }
}
