package design_patterns.creational.prototype;

public interface Prototype extends Cloneable {
    Prototype clone() throws CloneNotSupportedException;
}
