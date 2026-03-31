package core.constructor;

public class ConstructorChaining3 {
    public static void main(String[] args) {
        Child child=new Child();
        //Parent()--->Child(int)---->
    }
}

class Parent{
    Parent(){
        System.out.println("superclass default constructor");
    }
}
class Child extends Parent{
    Child(){
        this(5);//from super() & this() only can be used.
        System.out.println("subclass default constructor");
    }
    Child(int x){
        //super(); compiler will implicitly call superclass constructor.
        System.out.println("subclass parameterized constructor");
    }
}