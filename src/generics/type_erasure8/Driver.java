package generics.type_erasure8;

public class Driver {
    public static void main(String[] args) {
        //Before Compilation
        Box<Long> b1= new Box<>();

        Box2<Long> b2= new Box2<>();
        b1.setVal(123L);
        b2.setVal(23434L);

        //Post Compilation
        BoxPostCompilation bpc1= new BoxPostCompilation();
        Object val1= bpc1.geVal();     //Return Object Type: <T>

        BoxPostCompilation2 bpc2= new BoxPostCompilation2();
        Number val2= bpc2.geVal();      //Return Number Type: <T extends Number>
    }
}
