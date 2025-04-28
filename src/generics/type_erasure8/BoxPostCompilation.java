package generics.type_erasure8;
/**
 * Post-Compilation: JVM Get the following class after Type checking at compile time
 * T got replaced with the Object type
 */

public class BoxPostCompilation {
    private Object val;

    public Object geVal() {
        return val;
    }

    public void setVal(Object val) {
        this.val = val;
    }
}
