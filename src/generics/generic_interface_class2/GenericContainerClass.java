package generics.generic_interface_class2;

public class GenericContainerClass<T> implements Container<T> {

    private T val;

    @Override
    public void add(T val) {
        this.val= val;
    }

    @Override
    public T get() {
        return val;
    }
}
