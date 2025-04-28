package generics.bounded_type3;

/**
 * Bounded Types further restrict the <T> parameter variable
 */
public interface NumberContainer1<T extends Number> {
    void add(T item);
    T get();
}
