package generics.bounded_type3;

public class Driver2 {
    public static void main(String[] args) {
        MyNumber2 myNumber = new MyNumber2(100);
        Box2<MyNumber2> box= new Box2<>(myNumber);
        box.display();
    }
}
