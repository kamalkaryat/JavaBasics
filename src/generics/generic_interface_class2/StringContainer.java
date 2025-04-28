package generics.generic_interface_class2;

public class StringContainer implements Container<String>{

    private String strVal;

    @Override
    public void add(String val) {
        this.strVal= val;
    }

    @Override
    public String get() {
        return strVal;
    }
}
