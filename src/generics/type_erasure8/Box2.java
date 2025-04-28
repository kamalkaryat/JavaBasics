package generics.type_erasure8;

public class Box2<T extends Number>{
    private T val;

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }
}