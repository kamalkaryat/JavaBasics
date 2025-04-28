package generics.enum_demo6;

public class ArithematicOperations {
    public static void main(String[] args) {
        System.out.println("Add Two Integers: "+Operations.ADD.apply(10, 20));
        System.out.println("Add Two Doubles: "+Operations.ADD.apply(10.34, 20.234));
    }
}
enum Operations{
    ADD, SUB, MUL, DIV;

    public <T extends Number> double apply(T n1, T n2){
        return switch (this) {
            case ADD -> n1.doubleValue() + n2.doubleValue();
            case SUB -> n1.doubleValue() - n2.doubleValue();
            case MUL -> n1.doubleValue() * n2.doubleValue();
            case DIV -> n1.doubleValue() / n2.doubleValue();
            default -> throw new AssertionError("Unknown Error: " + this);
        };
    }
}
