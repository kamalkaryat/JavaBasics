package core.interface_demo;

public class Demo {
    public static void main(String[] args) {
        Child refV=new Child();
        refV.fun1();
        refV.fun2();
        refV.fun3();
    }
}

interface B{
    int var1=10;
    void fun2();
	/*default void fun2() {
		System.out.println("inside fun2 of interface B");
	}*/
}

interface C{
    int var2=10;
    void fun3();
}

class A{
    void fun1() {
        System.out.println("inside fun1");
    }
}

class Child extends A implements B,C{

    public void fun3() {
        System.out.println("inside fun3 of interface C");
    }
    public void fun2() {
        System.out.println("inside fun2 of interface B");
    }

}
