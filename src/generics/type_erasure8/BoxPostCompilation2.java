package generics.type_erasure8;
/**
 * Post-Compilation: JVM Get the following class after Type checking at compile time
 * If <T extends Number> then
 * T got replaced with the Number type
 */

public class BoxPostCompilation2 {
    private Number val;

    public Number geVal() {
        return val;
    }

    public void setVal(Number val) {
        this.val = val;
    }
}
