package generics.bounded_type3;

public class MyNumber2 extends Number implements Printable2 {
    private final int val;

    public MyNumber2(int val) {
        this.val = val;
    }

    @Override
    public void print() {
        System.out.println(val);
    }

    @Override
    public int intValue() {
        return val;
    }

    @Override
    public long longValue() {
        return val;
    }

    @Override
    public float floatValue() {
        return val;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
