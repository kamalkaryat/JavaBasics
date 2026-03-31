package core.constructor;

public class ConstructorInheritance2 {
    public static void main(String[] args) {
        B obj=new B();
    }
}
class A{
    public A(){
        System.out.println("Inside superclass");
    }
}

class B extends A{
    public B(){
        System.out.println("Inside subclass");
    }
}