package generics.bounded_type3;

/**
 * NumberContainer<T>       : Here T must be a subclass of Number
 */
public class NoContainerClass1 implements NumberContainer1<Integer> {
    private Integer item;

    @Override
    public void add(Integer item) {
        this.item= item;
    }

    @Override
    public Integer get() {
        return item;
    }
}